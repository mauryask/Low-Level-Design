package DesignPatterns.BehavioralPattern.ChainOfResponsibility.GoodExample;

/**
 * Consider a case where user places an order in an online ordering app
 * He goes through below steps (chains)
 * 1. Authentication: Whether user is logged in or not
 * 2. Authorization: User is authorized to make an order
 * 3. Validation: The item ordered is in stock?
 *  If all criteria met then order can be placed
 * */

public class Main {
    public static void main(String[] args) {
        Handler orderChain = new AuthenticationHandler();
        orderChain.setNext(new AuthorizationHandler()).setNext(new ValidationHandler());
        orderChain.handle(new Request());
    }
}
