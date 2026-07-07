package DesignPatterns.BehavioralPattern.ChainOfResponsibility.SupportHandler;

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
