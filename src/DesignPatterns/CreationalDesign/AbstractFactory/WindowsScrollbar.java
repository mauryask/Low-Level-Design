package DesignPatterns.CreationalDesign.AbstractFactory;

public class WindowsScrollbar implements Scrollbar{
    @Override
    public void paint() {
        System.out.println("Painted windows scrollbar!");
    }
}
