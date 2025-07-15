package DesignPatterns.Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("ironman.jpg");
        Image img2 = new ProxyImage("hulk.png");

        // The image is loaded lazily when needed,
        // saving time and resources if the
        // image is never displayed.

        //Image loaded only when first time display() method is called for this object
        img1.display();
        //2nd time the image will not be loaded from disk but cached one will be used to display
        img1.display();
    }
}
