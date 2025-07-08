package DesignPatterns.BehavioralPattern.Command;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        //Decoupling: One button can do may things
        Button button = new Button();
        button.setCommand(new BoldCommand(textEditor));
        button.click();
        button.setCommand(new ItalicCommand(textEditor));
        button.click();
        button.setCommand(new UnderlineCommand(textEditor));
        button.click();
    }
}
