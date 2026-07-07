package DesignPatterns.BehavioralPattern.State.VendingMachine;

public class WaitingForMoneyState extends State {
    WaitingForMoneyState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void pressButton() {
        System.out.println("Insert money first..");
    }

    @Override
    public void insertMoney() {
        System.out.println("Money inserted..");
        vendingMachine.setState(vendingMachine.getMoneyInsertedState());
    }
}
