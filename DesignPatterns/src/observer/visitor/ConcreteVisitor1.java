package observer.visitor;

public class ConcreteVisitor1 extends Visitor {

	//访问者对元素进行处理
	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getName()+" visited by "+this.getClass().getName());
	}
}
