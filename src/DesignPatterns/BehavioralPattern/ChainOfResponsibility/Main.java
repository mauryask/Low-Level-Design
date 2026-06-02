package DesignPatterns.BehavioralPattern.ChainOfResponsibility;
/*
* When a request need to be processed in a chain
* */

abstract class SupportHandler {
    SupportHandler nextHandler;

    void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract void handleRequest(String priority, String description);
}

class LowPriorityHandler extends SupportHandler {
    @Override
    void handleRequest(String priority, String description) {
        if (priority.equals("low")) {
            System.out.println("Level 1 support: handling low priority request: " + description);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(priority, description);
        } else {
            System.out.println("No handler present at the moment!!");
        }
    }
}


class MediumPriorityHandler extends SupportHandler {
    @Override
    void handleRequest(String priority, String description) {
        if (priority.equals("medium")) {
            System.out.println("Level 2 support: handling medium priority request: " + description);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(priority, description);
        } else {
            System.out.println("No handler present at the moment!!");
        }
    }
}


class HighPriorityHandler extends SupportHandler {
    @Override
    void handleRequest(String priority, String description) {
        if (priority.equals("high")) {
            System.out.println("Level 3 support: handling high priority request: " + description);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(priority, description);
        } else {
            System.out.println("No handler present at the moment!!");
        }
    }
}

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