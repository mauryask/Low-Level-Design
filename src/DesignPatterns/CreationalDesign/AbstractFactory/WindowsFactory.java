package DesignPatterns.CreationalDesign.AbstractFactory;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckbox();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new WindowsScrollbar();
    }
}
