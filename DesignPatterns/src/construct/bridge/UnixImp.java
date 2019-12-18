package construct.bridge;

public class UnixImp implements  Image{
	@Override
	public void doPaint(String str) {
		System.out.println(str+"at unix");
	}
}
