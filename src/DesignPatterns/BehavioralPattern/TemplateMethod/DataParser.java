package DesignPatterns.BehavioralPattern.TemplateMethod;

public abstract class DataParser {
    //Template Method: Define the steps in the algorithm
    //Note: final methods cannot be overridden, and its behavior(implementation) cannot be changed
    protected final void parse() {
        openFile();
        parseData();
        closeFile();
    }

    abstract void parseData();

    protected void openFile() {
        System.out.println("Opening file..");
    }

    protected void closeFile() {
        System.out.println("Closing file..");
    }
}
