package DesignPatterns.BehavioralPattern.ChainOfResponsibility.SupportHandler;

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
