package observer.visitor;

public class ConcreteElementA extends  Element {
	//元素被访问者访问
	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}
}
