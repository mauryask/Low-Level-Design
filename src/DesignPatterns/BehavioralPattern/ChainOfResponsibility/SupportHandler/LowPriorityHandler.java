package DesignPatterns.BehavioralPattern.ChainOfResponsibility.SupportHandler;

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
