package DesignPatterns.BehavioralPattern.ChainOfResponsibility.SupportHandler;
/*
* When a request need to be processed in a chain
* */


public class Main {
    private static SupportHandler getNextHandler() {
        LowPriorityHandler lowHandler = new LowPriorityHandler();
        MediumPriorityHandler mediumHandler = new MediumPriorityHandler();
        HighPriorityHandler highHandler = new HighPriorityHandler();
        lowHandler.setNextHandler(mediumHandler);
        mediumHandler.setNextHandler(highHandler);
        // Return the head of the chain
        return lowHandler;
    }

    public static void main(String[] args) {
        SupportHandler supportHandler = getNextHandler();
        supportHandler.handleRequest("low", "Unstable network");
        supportHandler.handleRequest("medium", "Black screen");
        supportHandler.handleRequest("high", "Server down");
    }
}