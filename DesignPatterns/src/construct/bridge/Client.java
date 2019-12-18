package construct.bridge;

public class Client {

	public static void main(String[] args) {
		Imagekind imagekind =  new GIFImage();
		Image image =  new WinImp();
		imagekind.image = image;
		imagekind.method("gif paint on window");
	}
}
