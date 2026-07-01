package DesignPatterns.Structural.FlyWeight.TreeGame;

import java.util.Arrays;

// Fly-weight
public class TreeType {
    private final String name;
    private final String color;
    private final byte[] textureMesh;

    public TreeType(String name, String color, byte[] textureMesh) {
        this.name = name;
        this.color = color;
        this.textureMesh = textureMesh;
    }

    public void display(int x, int y) {
        System.out.printf("Displaying [%s] tree of color [%s] with texture [%s] at location (%s, %s)%n", name, color, Arrays.toString(textureMesh), x, y);
    }
}