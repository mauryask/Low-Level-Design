package DesignPatterns.CreationalDesign.AbstractFactory;

public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering macOS button..");
    }
}
