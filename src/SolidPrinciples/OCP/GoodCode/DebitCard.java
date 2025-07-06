package SolidPrinciples.OCP.GoodCode;

public class DebitCard implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing amount: " + amount + " via Debit Card");
    }
}
