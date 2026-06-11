package DesignPatterns.CreationalDesign.AbstractFactory;

public class MacScrollbar implements Scrollbar{
    @Override
    public void paint() {
        System.out.println("Painted MAC scrollbar!!");
    }
}
