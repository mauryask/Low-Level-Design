package DesignPatterns.CreationalDesign.Factory;

public class MacDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new MacButton();
    }
}
