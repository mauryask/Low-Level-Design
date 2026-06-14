package DesignPatterns.CreationalDesign.Prototype.Game;

import java.util.Objects;

public record GamePiece(String color, int position) implements Prototype<GamePiece> {
    // Copy constructor
    public GamePiece(GamePiece source) {
        // Constructor chaining (prevents writing redundant code)
        this(Objects.requireNonNull(source, "Source can not be null at all!!").color, source.position);
    }

    @Override
    public GamePiece clone() {
        return new GamePiece(this);
    }
}
