package observer.strategy;

import observer.obervers.ConcreteSubject;

public class Client {

	public static void main(String[] args) {
		Strategy strategy = new BubbleSortStrategy();
		Context context = new Context(strategy);
		context.sort();
	}
}
