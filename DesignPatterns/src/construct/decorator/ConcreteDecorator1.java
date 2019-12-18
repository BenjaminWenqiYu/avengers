package construct.decorator;

public class ConcreteDecorator1 extends Decorator  {

	public ConcreteDecorator1(Component component) {
		super(component);
	}

	@Override
	public void doSomething() {
		//目标基本功能
		super.doSomething();
		//附加功能
		this.doAnotherThing();
	}

	public  void doAnotherThing() {
		System.out.println("功能B");
	}
}
