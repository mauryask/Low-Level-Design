package DesignPatterns.Structural.Adapter.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaypalToPaymentAdapter(new PaypalAPI());
        processor.processPayment(100.98);
    }
}
