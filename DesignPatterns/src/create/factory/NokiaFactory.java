package create.factory;

public class NokiaFactory implements  MobileFactory{
	@Override
	public Mobile productMobile() {
		System.out.println("诺基亚手机创造了");
		return new Nokia();
	}
}
