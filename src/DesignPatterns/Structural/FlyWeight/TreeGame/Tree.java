package DesignPatterns.Structural.FlyWeight.TreeGame;

// Context containing extrinsic information and holds reference to flyweight
public class Tree {
    private final int x;
    private final int y;
    private final TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw() {
        treeType.display(x, y);
    }
}