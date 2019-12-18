package construct.flyweight;

public class CharacterA extends  Character {

	public CharacterA() {
		this.letter = 'A';
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
