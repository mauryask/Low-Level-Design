package DesignPatterns.BehavioralPattern.ChainOfResponsibility.OrderSystem;

public class ValidationHandler extends Handler{
    @Override
    void handle(Request request) {
        if (!request.isItemInStock()) {
            System.out.println("400 Bad Request: Item out of stock");
            return;
        }
        System.out.println("Item is available in stock");
        checkNext(request);
    }
}
