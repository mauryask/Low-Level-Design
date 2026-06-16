package DesignPatterns.Structural.FlyWeight.TreeGame;

import java.util.ArrayList;
import java.util.List;

// Client
public class Forest {
    private final List<Tree> trees = new ArrayList<>();

    public void plantTrees(int x, int y, String name, String color, byte[] textureMesh) {
        TreeType treeType = TreeFactory.getTreeType(name, color, textureMesh);
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
    }

    public void draw() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}