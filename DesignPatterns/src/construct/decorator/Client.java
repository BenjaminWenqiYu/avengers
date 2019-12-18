package construct.decorator;

import java.io.BufferedInputStream;

/**
 *如果使用继承而不采用装饰模式，会使得类急剧膨胀
 */
public class Client {

	public static void main(String[] args) {
		Decorator decorator = new ConcreteDecorator1(new ConcreteDecorator2(new ConcreteComponent()));
		decorator.doSomething();
	}
}
