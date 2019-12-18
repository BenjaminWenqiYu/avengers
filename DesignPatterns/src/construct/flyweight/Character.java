package construct.flyweight;

public abstract class Character {

	protected char letter;
	protected int fontsize;

	public int getFontsize() {
		return fontsize;
	}

	public void setFontsize(int fontsize) {
		this.fontsize = fontsize;
	}

	public abstract  void display();

	public abstract  void setFont();
}
