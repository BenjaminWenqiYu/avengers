package com.avengers.example;

import org.apache.flink.api.common.functions.RuntimeContext;
import org.apache.flink.streaming.connectors.elasticsearch.ElasticsearchSinkFunction;
import org.apache.flink.streaming.connectors.elasticsearch.RequestIndexer;
import org.apache.flink.streaming.connectors.elasticsearch6.ElasticsearchSink;
import org.apache.http.HttpHost;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.Requests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SinkES {

	public static void main(String[] args) {

		ElasticsearchSink elasticsearchSink = getdElasticSearchSink("192.168.1.204");

	}

	private static ElasticsearchSink getdElasticSearchSink(String hosts) {
		List<HttpHost> httpHosts = new ArrayList<>();
		for (String host : hosts.split(",")){
			httpHosts.add(new HttpHost(host, 9200, "http"));
		}

		ElasticsearchSink.Builder<String> esSinkBuilder = new ElasticsearchSink.Builder<>(
				httpHosts,
				new ElasticsearchSinkFunction<String>() {
					public IndexRequest createIndexRequest(String element) {
						Map<String, String> json = new HashMap<>();
						json.put("data", element);

						return Requests.indexRequest()
								.index("finkSink")
								.type("doc")
								.source(json);
					}

					@Override
					public void process(String element, RuntimeContext ctx, RequestIndexer indexer) {
						indexer.add(createIndexRequest(element));
					}
				}
		);
		//缓冲区大小，Flink接收1条数据并存入到ES中
		esSinkBuilder.setBulkFlushMaxActions(1);
		return esSinkBuilder.build();
	}
}
