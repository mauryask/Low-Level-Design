package DesignPatterns.CreationalDesign.Factory;

public class AndroidButton implements Button{
    @Override
    public void paint() {
        System.out.println("Painting android button!!");
    }
}
