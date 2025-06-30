package SolidPrinciples.DIP.GoodCode;

public class Main {
    public static void main(String[] args) {
        SMSService smsService = new SMSService();
        EmailService emailService = new EmailService();
        NotificationService smsNotificationService = new NotificationService(smsService);
        NotificationService emailNotificationService = new NotificationService(emailService);
        smsNotificationService.notify("May Day!! May Day!!");
        emailNotificationService.notify("Yo!! Whats up!!");
    }
}
