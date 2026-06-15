package DesignPatterns.Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaypalToPaymentAdapter(new PaypalAPI());
        processor.processPayment(100.98);
    }
}
