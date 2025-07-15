package DesignPatterns.Structural.Adapter;

public class EmailService implements NotificationService {
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("Email is being sent over an insecure Mail Service:\nTo:: " + to);
        System.out.println("Subject:: " + subject);
        System.out.println("Body:: " + body);
    }
}
