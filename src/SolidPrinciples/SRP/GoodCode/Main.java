package SolidPrinciples.SRP.GoodCode;

public class Main {
    public static void main(String[] args) {
        User user = new User("Tony Stark", "tony@starkindusries.com");
        EmailService emailService = new EmailService();
        emailService.sendEmailNotification(user);
        UserRepository userRepository = new UserRepository();
        userRepository.saveUserToDB(user);
    }
}
