package construct.composite;

public class Client {

	public static void main(String[] args) {
		Component component  = new Leaf();
		Component component2 =  new Leaf();

		Composite composite = new Composite();
		composite.add(component);
		composite.add(component2);

		composite.doSomeThing();
	}
}
