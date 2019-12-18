package observer.iterator;

public class Client {

	public static void main(String[] args) {
		ConcreteAggregate concreteAggregate = new ConcreteAggregate();
		concreteAggregate.add(0,"A");
		concreteAggregate.add(1,"B");
		concreteAggregate.add(2,"C");
		concreteAggregate.add(3,"D");

		MyIterator iterator = new ConcreteIterator(concreteAggregate);
		Object first = iterator.first();
		System.out.println(first);
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
		}
	}
}
