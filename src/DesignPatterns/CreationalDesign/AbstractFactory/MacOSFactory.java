package DesignPatterns.CreationalDesign.AbstractFactory;

//Concrete factory
public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckbox();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new MacScrollbar();
    }
}
