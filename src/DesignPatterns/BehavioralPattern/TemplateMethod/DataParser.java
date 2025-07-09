package DesignPatterns.BehavioralPattern.TemplateMethod;

public abstract class DataParser {
    //Template Method: Define the steps in the algorithm
    public final void parse() {
        openFile();
        parseData();
        closeFile();
    }

    abstract void parseData();

    public void openFile() {
        System.out.println("Opening file..");
    }

    public void closeFile() {
        System.out.println("Closing file..");
    }
}
