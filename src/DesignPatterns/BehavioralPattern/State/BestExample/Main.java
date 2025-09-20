package DesignPatterns.BehavioralPattern.State.BestExample;

public class Main {
    public static void main(String[] args) {
        // Here machine object changing its behaviour when the insert state of the object changes
        VendingMachine machine = new VendingMachine();
        machine.pressButton();
        machine.insertMoney();
        machine.pressButton(); // State changed to waiting for money

        machine.pressButton();
    }
}
