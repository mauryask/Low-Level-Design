package DesignPatterns.Structural.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class BulletFactory {
    private static final Map<String, BulletType> bullets = new HashMap<>();

    public static BulletType getBulletType(String color) {
        //If a bullet is not already existing, create one
        if (!bullets.containsKey(color)) {
            bullets.put(color, new BulletType(color));
        }
        return bullets.get(color);
    }
}
