package SolidPrinciples.DIP.GoodCode;

public class SMSService implements NotificationChannel {
    @Override
    public void send(String sms) {
        System.out.println("SMS is being sent.." + sms);
    }
}
