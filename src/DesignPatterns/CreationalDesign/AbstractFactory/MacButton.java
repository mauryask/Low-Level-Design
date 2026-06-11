package DesignPatterns.CreationalDesign.AbstractFactory;

// Concrete product
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painted MAC button!!");
    }
}
