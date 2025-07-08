package DesignPatterns.BehavioralPattern.Strategy;

public class DebitCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.print("Paying via Debit Card..");
    }
}
