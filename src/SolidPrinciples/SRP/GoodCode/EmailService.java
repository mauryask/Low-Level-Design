package SolidPrinciples.SRP.GoodCode;

public class EmailService {
    public void sendEmailNotification(User user) {
        System.out.println("Sending mail to : " + user.getEmail() + ", Welcome " + user.getName());
    }
}
