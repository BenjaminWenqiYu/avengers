package construct.bridge;

public abstract class Imagekind {

	protected Image image;

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public abstract void  method(String str);

}
