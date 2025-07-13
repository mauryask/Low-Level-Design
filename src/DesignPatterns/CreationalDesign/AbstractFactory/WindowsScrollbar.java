package DesignPatterns.CreationalDesign.AbstractFactory;

public class WindowsScrollbar implements Scrollbar {
    @Override
    public void scroll() {
        System.out.println("Scrolling windows scrollbar..");
    }
}
