package create.factory;

public class Client {

	public static void main(String[] args) {
		MobileFactory factory;
		Mobile mobile;
		factory = new MotorolaFactory();
		mobile = factory.productMobile();
		mobile.call();

		factory = new NokiaFactory();
		mobile = factory.productMobile();
		mobile.call();
	}
}
