package observer.Interpreter;

public class Not extends  Expression {

	private Expression expression;

	public Not(Expression expression) {
		this.expression = expression;
	}

	@Override
	public boolean interpreter(Context context) {
		return ! expression.interpreter(context);
	}
}