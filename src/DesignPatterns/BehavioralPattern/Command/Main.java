package DesignPatterns.BehavioralPattern.Command;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(); //Receiver
        //Decoupling: One button can do many actions. And it is completely decoupled from TextEditor
        Button button = new Button(); //Invoker
        button.setCommand(new BoldCommand(textEditor));
        button.click();
        button.setCommand(new ItalicCommand(textEditor));
        button.click();
        button.setCommand(new UnderlineCommand(textEditor));
        button.click();
    }
}
