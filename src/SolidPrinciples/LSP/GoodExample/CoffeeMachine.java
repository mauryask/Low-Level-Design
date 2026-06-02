package SolidPrinciples.LSP.GoodExample;

public class CoffeeMachine extends ElectronicSystem{
    @Override
    public void turnOn() {
        System.out.println("Turning coffee machine on..");
    }
}
