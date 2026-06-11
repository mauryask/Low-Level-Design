package DesignPatterns.CreationalDesign.AbstractFactory;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Painted windows checkbox!!");
    }
}
