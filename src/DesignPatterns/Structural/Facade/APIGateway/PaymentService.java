package DesignPatterns.Structural.Facade.APIGateway;

public class PaymentService {
    public void getPaymentInfo(String paymentId) {
        System.out.println("Payment Info:: " + paymentId);
    }
}
