package observer.Interpreter;

public class And extends  Expression {

	private Expression left;
	private Expression right;

	public And(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean interpreter(Context context) {

		return left.interpreter(context)  && right.interpreter(context);
	}
}
