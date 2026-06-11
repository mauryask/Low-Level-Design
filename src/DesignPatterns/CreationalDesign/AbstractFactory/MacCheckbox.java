package DesignPatterns.CreationalDesign.AbstractFactory;

public class MacCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Painted MAC checkbox!!");
    }
}
