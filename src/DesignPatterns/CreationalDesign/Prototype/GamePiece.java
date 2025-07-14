package DesignPatterns.CreationalDesign.Prototype;

public class GamePiece implements Prototype<GamePiece> {
    private final String color;
    private final int position;

    public GamePiece(String color, int position) {
        this.color = color;
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "GamePieces{" +
                "color='" + color + '\'' +
                ", position=" + position +
                '}';
    }

    @Override
    public GamePiece clone() {
        return new GamePiece(this.color, this.position);
    }
}
