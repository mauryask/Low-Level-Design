package SolidPrinciples.DIP.GoodCode;

public class NotificationService {
    private NotificationChannel notificationChannel;

    NotificationService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void notify(String msg) {
        notificationChannel.send(msg);
    }
}
