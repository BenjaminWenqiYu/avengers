package observer.visitor;

public class Client {

	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.attach(new ConcreteElementA());

		ConcreteVisitor1 v1 =  new ConcreteVisitor1();
		ConcreteVisitor2 v2 =  new ConcreteVisitor2();

		o.accept(v1);
		o.accept(v2);




	}
}
