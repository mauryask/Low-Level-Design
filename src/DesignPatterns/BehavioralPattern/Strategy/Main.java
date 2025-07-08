package DesignPatterns.BehavioralPattern.Strategy;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        PaymentStrategy creditCard = new CreditCard();
        PaymentStrategy debitCard = new DebitCard();
        PaymentStrategy upi = new UPI();
        paymentService.setPaymentStrategy(upi);
        paymentService.pay();
    }
}

