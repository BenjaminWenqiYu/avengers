package observer.visitor;

public class ConcreteVisitor2 extends Visitor  {
	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getName()+" visited by "+this.getClass().getName());
	}

}
