package DesignPatterns.CreationalDesign.Prototype.GraphicEditor;

import java.util.Objects;

public class Shape implements Prototype {
    private final String color;
    private final String type;
    private final int size;

    public Shape(String color, String type, int size) {
        this.color = color;
        this.type = type;
        this.size = size;
    }

    public Shape(Shape source) {
        Objects.requireNonNull(source, "The source can not be null at all!!");
        this.color = source.color;
        this.type = source.type;
        this.size = source.size;
    }

    @Override
    public Shape clone() {
        return new Shape(this);
    }
}
