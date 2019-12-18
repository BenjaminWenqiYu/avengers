package create.abstractFactory;

public class ProductB1 extends  AbstractProductB {
	@Override
	public void interact(AbstractProductA a) {
		System.out.println(this.getClass().getName()+" interact with "+a.getClass().getName());
	}
}
