package DesignPatterns.CreationalDesign.Factory;

public abstract class Dialog {
    public void renderButton() {
        Button button = createButton();
        button.paint();
    }

    protected abstract Button createButton();
}
