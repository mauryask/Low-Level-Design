package SolidPrinciples.OCP.GoodCode;

public class UPI implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing amount: " + amount + " via UPI");
    }
}
