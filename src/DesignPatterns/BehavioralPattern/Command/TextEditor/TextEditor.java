package DesignPatterns.BehavioralPattern.Command.TextEditor;

// Receiver: Knows how to perform the actual work
public class TextEditor {
    public void boldText() {
        System.out.println("Making text bold..");
    }

    public void italicText() {
        System.out.println("Making text italic..");
    }

    public void underlineText() {
        System.out.println("Making text underlined..");
    }
}
