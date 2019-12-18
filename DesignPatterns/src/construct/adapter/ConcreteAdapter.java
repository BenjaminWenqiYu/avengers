package construct.adapter;

/**
 * 适配器
 */
public class ConcreteAdapter extends  ConcreteAdaptee implements Target {
	@Override
	public void myOutput() {
		this.output();
	}
}
