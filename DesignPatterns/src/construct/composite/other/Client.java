package construct.composite.other;

public class Client {

	public static void main(String[] args) {
		Component2 component  = new Leaf2();
		Component2 component2 =  new Leaf2();

		Component2 composite = new Composite2();
		composite.add(component);
		composite.add(component2);

		composite.doSomeThing();
	}
}
