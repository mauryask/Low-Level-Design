package PaymentSystemExample;

public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("JamesCreditCard", new CreditCard("James", "640230"));
        ps.addPaymentMethod("MaxDebitCard", new DebitCard("Max", "6548998"));
        ps.addPaymentMethod("DeanUPI", new UPI("dean@okaxis"));
        ps.makePayment("JamesCreditCard");
        ps.makePayment("MaxDebitCard");
        ps.makePayment("DeanUPI");
    }
}
