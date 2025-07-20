package DesignPatterns.Practice.FlyWeight;

public class Character {
    private final Character characatreValue;

    public Character(char character, int fontSize, String color, String fontStyle) {
        this.characatreValue = CharacterFactory.getCharacter(character, fontSize, color, fontStyle);
    }
}
