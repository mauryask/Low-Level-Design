package DesignPatterns.CreationalDesign.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Application application = new Application(new MacOSFactory());
        application.paint();
    }
}
