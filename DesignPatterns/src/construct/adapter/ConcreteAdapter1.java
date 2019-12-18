package construct.adapter;

/**
 * 适配器
 */
public class ConcreteAdapter1 extends  ConcreteAdaptee1 implements Target {
	@Override
	public void myOutput() {
		this.output();
	}
}
