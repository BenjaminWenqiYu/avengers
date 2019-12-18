package observer.iterator;

public class ConcreteIterator extends  MyIterator{

	private  ConcreteAggregate aggregate;
	//当前迭代的位置
	private int current = 0;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		return aggregate.get(0);
	}

	@Override
	public Object next() {
		return aggregate.get(current++);
	}

	@Override
	public boolean hasNext() {
		return current != aggregate.count();
	}

	@Override
	public Object currentItem() {
		return aggregate.get(current);
	}
}
