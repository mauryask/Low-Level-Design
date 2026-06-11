package DesignPatterns.CreationalDesign.Factory;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("Painting MAC button!!");
    }
}
