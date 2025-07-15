package DesignPatterns.Structural.Proxy;

public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image from disk..");
    }

    @Override
    public void display() {
        System.out.println("Displaying image:: " + fileName);
    }
}
