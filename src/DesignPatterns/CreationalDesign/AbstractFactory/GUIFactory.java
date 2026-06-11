package DesignPatterns.CreationalDesign.AbstractFactory;

// Abstract factory
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
    Scrollbar createScrollbar();
}
