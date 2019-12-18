package observer.Interpreter;

public class Or extends  Expression {


	private Expression left;
	private Expression right;

	public Or(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean interpreter(Context context) {

		return left.interpreter(context)  || right.interpreter(context);
	}
}
