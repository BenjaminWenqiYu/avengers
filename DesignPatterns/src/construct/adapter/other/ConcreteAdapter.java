package construct.adapter.other;

import construct.adapter.Target;

/**
 * 适配器：必须要维护一个adaptee的成员变量，防止类的爆炸式增长
 */
public class ConcreteAdapter implements Target {

	private Adaptee adaptee;

	public ConcreteAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void myOutput() {
		this.adaptee.output();
	}
}
