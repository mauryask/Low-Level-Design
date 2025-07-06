package SolidPrinciples.OCP.GoodCode;

public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod debitCard = new DebitCard();
        PaymentMethod upi = new UPI();
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(creditCard, 406.3);
        paymentProcessor.processPayment(debitCard, 256);
        paymentProcessor.processPayment(upi, 4551);
    }
}
