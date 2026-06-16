package DesignPatterns.Structural.Facade.SmartHome;

// Client
public class Main {
    public static void main(String[] args) {
        SmartHomeFacade smartHomeFacade = new SmartHomeFacade();
        smartHomeFacade.leaveHome();
    }
}
