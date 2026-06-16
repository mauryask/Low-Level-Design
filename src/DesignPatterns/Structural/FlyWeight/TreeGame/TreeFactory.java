package DesignPatterns.Structural.FlyWeight.TreeGame;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> treeMap = new HashMap<>();

    public static TreeType getTreeType(String name, String color, byte[] textureMesh) {
        if (!treeMap.containsKey(name)) {
            treeMap.put(name, new TreeType(name, color, textureMesh));
        }
        return treeMap.get(name);
    }
}
