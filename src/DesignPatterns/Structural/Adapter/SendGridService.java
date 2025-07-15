package DesignPatterns.Structural.Adapter;

public class SendGridService {
    public void sendMail(String recipient, String title, String content) {
        System.out.println("Email is being sent via Send Grid Mail Service\nTo:: " + recipient);
        System.out.println("Title:: " + title);
        System.out.println("Content:: " + content);
    }
}
