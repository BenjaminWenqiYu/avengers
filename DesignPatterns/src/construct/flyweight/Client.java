package construct.flyweight;

public class Client {

	public static void main(String[] args) {
		CharacterFactory factory = new CharacterFactory().getInstance();

		Character a = factory.getCharacter("A");
		a.setFontsize(20);
		a.display();


	}
}
