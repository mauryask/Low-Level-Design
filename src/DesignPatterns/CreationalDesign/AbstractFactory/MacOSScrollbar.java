package DesignPatterns.CreationalDesign.AbstractFactory;

public class MacOSScrollbar implements Scrollbar{
    @Override
    public void scroll() {
        System.out.println("Scrolling macOS scrollbar..");
    }
}
