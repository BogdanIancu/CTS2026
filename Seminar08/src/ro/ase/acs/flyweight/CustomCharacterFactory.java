package ro.ase.acs.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CustomCharacterFactory {
    private Map<Character, TextCharacter> collection = new HashMap<>();

    public TextCharacter getCharacter(char asciiCode) {
        if (!collection.containsKey(asciiCode)) {
            TextCharacter character = new CustomCharacter(
                    new byte[]{100, 110}, asciiCode
            );
            System.out.println("Character created -> ");
            collection.put(asciiCode, character);
        }
        return collection.get(asciiCode);
    }
}
