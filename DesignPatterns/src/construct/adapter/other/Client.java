package construct.adapter.other;

import construct.adapter.ConcreteAdapter1;
import construct.adapter.Target;

public class Client {

	public static void main(String[] args) {
		Target target =  new ConcreteAdapter(new ConcreteAdaptee());
		target.myOutput();
	}
}
