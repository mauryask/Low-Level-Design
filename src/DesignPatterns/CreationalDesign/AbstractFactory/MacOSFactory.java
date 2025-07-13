package DesignPatterns.CreationalDesign.AbstractFactory;

public class MacOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Scrollbar createScrollBar() {
        return new MacOSScrollbar();
    }
}
