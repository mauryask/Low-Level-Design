package DesignPatterns.Structural.FlyWeight;

public class Bullet {
    private final BulletType bulletType; //Intrinsic property
    //Extrinsic property unique to all bullets
    private final int x;
    private final int y;
    private final int velocity;

    public Bullet(String color, int x, int y, int velocity) {
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        this.bulletType = BulletFactory.getBulletType(color);
        System.out.println("Creating bullet at (" + x + ", " + y + ") with velocity " + velocity);
    }

    public void displayBullet() {
        System.out.println("Bullet at (" + x + ", " + y + ") moving at velocity " + velocity);
    }
}
