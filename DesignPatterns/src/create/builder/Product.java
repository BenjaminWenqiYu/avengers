package create.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

	List<String> list = new ArrayList<String>();

	public void add(String content) {
		list.add(content);
	}

	public void show() {
		System.out.println("display product:");
		for (String content : list) {
			System.out.println(content);
		}
	}
}
