package DesignPatterns.Structural.Adapter;

public class Main {
    public static void main(String[] args) {
//        NotificationService emailService = new EmailService();
//        emailService.send("tonystartk@starkindustries.com",
//                "Regarding regular DRUG deal",
//                "When you are sending the next batch of Cocaine, MDMA Hash and Marijuana.?");
        NotificationService sendGridMailService = new SendGridAdapter(new SendGridService());
        sendGridMailService.send("peterparker@partenr.starkindustries.com",
                "Privacy concerns, Switching mail service",
                "All the communication regarding ongoing drug deal will be done here from now on.");

    }
}
