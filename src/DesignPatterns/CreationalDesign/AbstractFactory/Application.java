package DesignPatterns.CreationalDesign.AbstractFactory;

// Client: The below code can be written main()  as well
public class Application {
    private final Button button;
    private final Checkbox checkbox;
    private final Scrollbar scrollbar;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
        scrollbar = factory.createScrollbar();
    }

    void paint() {
        button.paint();
        checkbox.paint();
        scrollbar.paint();
    }
}