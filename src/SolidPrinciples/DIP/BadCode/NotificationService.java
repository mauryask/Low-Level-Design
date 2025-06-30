package SolidPrinciples.DIP.BadCode;

//High level module: Depends on low level modules that violates the DIP principle
public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;


    NotificationService() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    void notifyByEmail() {
        emailService.sendEmail();
    }

    void notifyBySms() {
        smsService.senSMS();
    }
}
