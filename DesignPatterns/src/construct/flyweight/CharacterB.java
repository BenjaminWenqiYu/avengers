package construct.flyweight;

public class CharacterB extends  Character {

	public CharacterB() {
		this.letter = 'B';
		this.fontsize =12;
	}

	@Override
	public void display() {
		System.out.println(this.letter +" "+this.fontsize);
	}

	@Override
	public void setFont() {
		this.fontsize = fontsize;
	}
}
