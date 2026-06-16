package DesignPatterns.Structural.FlyWeight.BulletGame;

public class BulletType {
    private final String color; //Intrinsic property shared by multiple bullets

    public BulletType(String color) {
        this.color = color;
    }
}
