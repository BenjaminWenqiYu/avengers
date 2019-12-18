package create.abstractFactory;

public class Client {
	private AbstractProductA a;
	private AbstractProductB b;

	public  Client(AbstractFactory factory) {
		a = factory.createProductA();
		b = factory.createProductB();
	}

	public  void run() {
		b.interact(a);
	}

}
