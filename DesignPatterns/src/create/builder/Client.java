package create.builder;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		Builder builderA = new ConcreteBuilderA();
		Builder builderB = new ConcreteBuilderB();

		director.build(builderA);
		Product productA = builderA.getResult();
		productA.show();

		director.build(builderB);
		Product productB = builderB.getResult();
		productB.show();

	}

}
