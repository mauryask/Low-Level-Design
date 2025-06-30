package SolidPrinciples.DIP.GoodCode;

public class EmailService implements NotificationChannel {
    @Override
    public void send(String sms) {
        System.out.println("Email is being sent.." + sms);
    }
}
