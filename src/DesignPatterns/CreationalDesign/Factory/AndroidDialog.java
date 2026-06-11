package DesignPatterns.CreationalDesign.Factory;

public class AndroidDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new AndroidButton();
    }
}
