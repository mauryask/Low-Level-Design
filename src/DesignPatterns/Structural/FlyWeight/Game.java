package DesignPatterns.Structural.FlyWeight;

public class Game {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Bullet redBullet = new Bullet("Red", i * 2, i * 5, 10);
        }

        for (int i = 0; i < 5; i++) {
            Bullet greenBullet = new Bullet("Green", i * 5, i * 8, 12);
        }
    }
}
