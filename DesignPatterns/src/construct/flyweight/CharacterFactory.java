package construct.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
	private Map<String,Character> characters = new HashMap<String,Character>();

	public CharacterFactory() {
		characters.put("A",new CharacterA());
		characters.put("B",new CharacterB());
	}

	private static  CharacterFactory instance;

	public static CharacterFactory getInstance() {
		if(null == instance) {
			instance =  new CharacterFactory();
		}
		return  instance;
	}

	public  Character getCharacter(String key) {
		Character character = characters.get(key);
		if(null == character) {
			if("A".equals(key)) {
				character =  new CharacterA();
			}else {
				character =  new CharacterB();
			}
			characters.put(key,character);
		}
		return character;
	}



}
