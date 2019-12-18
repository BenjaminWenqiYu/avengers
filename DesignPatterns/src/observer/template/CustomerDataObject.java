package observer.template;

/**
 * 子类:方法的实现
 */
public class CustomerDataObject extends  DateObject {
	@Override
	public void connect() {
		System.out.println("connect");
	}

	@Override
	public void select() {
		System.out.println("select");
	}

	@Override
	public void process() {
		System.out.println("process");
	}

	@Override
	public void close() {
		System.out.println("close");
	}
}
