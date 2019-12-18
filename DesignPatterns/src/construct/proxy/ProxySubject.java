package construct.proxy;

public class ProxySubject implements  Subject {

	//以真实角色作为代理角色的属性
	private RealSubject realSubject;

	@Override
	public void request() {

		this.preRequest();

		if(null == realSubject) {
			realSubject =  new RealSubject();
		}
		//真实角色所完成的功能
		realSubject.request();

		this.postRequest();
	}

	private void preRequest() {
		System.out.println("preRequest");
	}

	private void postRequest() {
		System.out.println("postRequest");
	}

}
