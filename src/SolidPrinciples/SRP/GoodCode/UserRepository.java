package SolidPrinciples.SRP.GoodCode;

public class UserRepository {
    public void saveUserToDB(User user) {
        System.out.println("Saving user to DB => Name: " + user.getName() + " Email:  " + user.getEmail());
    }
}
