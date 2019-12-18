package observer.Interpreter;

public class Variable extends  Expression {

	public Variable(String name) {
		this.name = name;
	}

	private  String name;

	@Override
	public boolean interpreter(Context context) {
		return context.lookup(this);
	}
}
