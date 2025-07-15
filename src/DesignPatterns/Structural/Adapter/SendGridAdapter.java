package DesignPatterns.Structural.Adapter;

public class SendGridAdapter implements NotificationService {
    private final SendGridService sendGridService;

    public SendGridAdapter(SendGridService sendGridService) {
        this.sendGridService = sendGridService;
    }

    @Override
    public void send(String to, String subject, String body) {
        sendGridService.sendMail(to, subject, body);
    }
}
