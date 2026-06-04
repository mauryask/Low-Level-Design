package DesignPatterns.BehavioralPattern.ChainOfResponsibility.GoodExample;

public class AuthorizationHandler extends Handler {
    @Override
    void handle(Request request) {
        if (!request.isAdmin() && !request.isCustomer()) {
            System.out.println("403 Forbidden: User is not authorized to make an order");
            return;
        }
        System.out.println("User is authorized to make this order");
        checkNext(request);
    }
}

