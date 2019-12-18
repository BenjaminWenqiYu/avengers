package observer.Interpreter;

public class Client {

	public static void main(String[] args) {

		Context context =  new Context();

		//变量
		Variable x = new Variable("x");
		Variable y = new Variable("y");

		//常量
		Constant c = new Constant(true);

		//为变量赋值
		context.assign(x,false);
		context.assign(y,true);

		Expression expression = new Or(new And(c, x), new And(y, new Not(x)));

		//HashMap获取变量的值
		System.out.println("x = "+x.interpreter(context));
		System.out.println("y = "+y.interpreter(context));

		System.out.println("expression = "+expression.interpreter(context));
	}
}
