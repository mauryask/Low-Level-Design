package DesignPatterns.Structural.Facade.APIGateway;

public class UserService {
    public void getUserDetails(String userId) {
        System.out.println("User Info:: " + userId);
    }
}
