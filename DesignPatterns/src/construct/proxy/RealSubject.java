package construct.proxy;

public class RealSubject implements  Subject {

	@Override
	public void request() {
		System.out.println("from real subject");
	}
}
