package DesignPatterns.BehavioralPattern.ChainOfResponsibility.OrderSystem;

public class Request {
    public boolean isAdmin() {
        return true;
    }

    public boolean isCustomer() {
        return true;
    }

    public boolean isItemInStock() {
        return true;
    }

    public boolean isAuthenticated() {
        return true;
    }
}
