package construct.adapter;

public class Client {

	public static void main(String[] args) {
		Target target =  new ConcreteAdapter();
		target.myOutput();

		Target target1 =  new ConcreteAdapter1();
		target1.myOutput();
	}
}
