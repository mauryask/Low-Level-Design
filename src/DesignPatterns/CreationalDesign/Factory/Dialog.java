package DesignPatterns.CreationalDesign.Factory;

// Client requests this factory to create product objects
public abstract class Dialog {
    // Factory method
    public void renderButton() {
        Button button = createButton();
        button.paint();
    }

    protected abstract Button createButton();
}

/*
* Now try adding a new Button say LinuxButton
* You will notice that existing code is not even being touched at all: That's the beauty
* */