package create.factory;

public class MotorolaFactory implements  MobileFactory {
	@Override
	public Mobile productMobile() {
		System.out.println("摩托罗拉工厂创造了");
		return new Motorola();
	}
}
