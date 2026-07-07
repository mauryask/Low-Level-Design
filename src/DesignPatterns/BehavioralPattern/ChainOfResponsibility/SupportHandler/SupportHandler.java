package DesignPatterns.BehavioralPattern.ChainOfResponsibility.SupportHandler;

abstract class SupportHandler {
    SupportHandler nextHandler;

    void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract void handleRequest(String priority, String description);
}
