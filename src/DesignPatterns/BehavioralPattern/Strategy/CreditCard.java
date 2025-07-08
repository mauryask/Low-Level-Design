package DesignPatterns.BehavioralPattern.Strategy;

public class CreditCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.print("Paying via Credit Card..");
    }
}
