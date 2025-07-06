package SolidPrinciples.SRP.BadCode;

//BAd code violates SRP principle: as User class has multiple unrelated responsibilities
public class User {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void saveUserToDB() {
        System.out.println("Saving user to DB => Name: " + name + " Email:  " + email);
    }

    public void sendEmailNotification() {
        System.out.println("Sending mail to : " + email + "Welcome " + name);
    }
}
