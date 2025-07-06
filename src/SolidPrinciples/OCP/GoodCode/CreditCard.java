package SolidPrinciples.OCP.GoodCode;

public class CreditCard implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing amount: " + amount + " via Credit Card");
    }
}
