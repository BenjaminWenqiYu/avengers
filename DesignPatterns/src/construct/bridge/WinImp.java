package construct.bridge;

public class WinImp  implements  Image{
	@Override
	public void doPaint(String str) {
		System.out.println(str+" at windows");
	}
}
