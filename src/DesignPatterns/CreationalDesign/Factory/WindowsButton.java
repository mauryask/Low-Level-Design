package DesignPatterns.CreationalDesign.Factory;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting windows button!!");
    }
}
