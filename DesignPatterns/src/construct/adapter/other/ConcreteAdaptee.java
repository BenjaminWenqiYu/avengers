package construct.adapter.other;

public class ConcreteAdaptee implements Adaptee {
	@Override
	public void output() {
		System.out.println("from ConcreteAdaptee");
	}
}
