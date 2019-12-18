package observer.template;

/**
 * 父类定义时顺序
 */
public abstract class DateObject {

	public abstract void connect();
	public abstract void select();
	public abstract void process();
	public abstract void close();

	/**
	 * 模板方法:定义执行的步骤
	 */
	public void run() {
		this.connect();
		this.select();
		this.process();
		this.close();
	}
}
