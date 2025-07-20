package DesignPatterns.Practice.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<String, Character> characters = new HashMap<>();

    public static Character getCharacter(char character, int fontSize, String color, String fontStyle) {
        String key = character + ":" + fontSize + ":" + color + ":" + fontStyle;
        if (!characters.containsKey(key)) {
            characters.put(key, new Character(character, fontSize, color, fontStyle));
        }
        return characters.get(key);
    }
}
