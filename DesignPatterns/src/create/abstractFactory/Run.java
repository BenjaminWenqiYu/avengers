package create.abstractFactory;

public class Run {

	public static void main(String[] args) {
		AbstractFactory factory1 = new ConcreteFactory1();
		Client client1 = new Client(factory1);
		client1.run();

		AbstractFactory factory2 = new ConcreteFactory2();
		Client client2 = new Client(factory2);
		client2.run();
	}
}
