package SolidPrinciples.OCP.GoodCode;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount); //Run time polymorphism
    }
}
