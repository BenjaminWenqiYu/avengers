package observer.Interpreter;

public class Constant extends  Expression {
	private  boolean value;

	public Constant(boolean value) {
		this.value = value;
	}

	@Override
	public boolean interpreter(Context context) {
		return value;
	}
}
