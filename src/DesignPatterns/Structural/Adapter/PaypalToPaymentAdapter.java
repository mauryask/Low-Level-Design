package DesignPatterns.Structural.Adapter;

// Concrete adapter
public class PaypalToPaymentAdapter implements PaymentProcessor {
    private final PaypalAPI paypalAPI;

    public PaypalToPaymentAdapter(PaypalAPI paypalAPI) {
        this.paypalAPI = paypalAPI;
    }

    @Override
    public void processPayment(double amount) {
        paypalAPI.pay(amount);
    }
}
