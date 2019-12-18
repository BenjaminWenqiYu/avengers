package observer.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends  Aggregate {

	private List list = new ArrayList<>();

	@Override
	public MyIterator createIterator() {
		return new ConcreteIterator(this);
	}

	public int count() {
		return list.size();
	}


	public Object get(int index) {
		return list.get(index);
	}

	public void add(int index,String value) {
		list.add(index,value);
	}
}
