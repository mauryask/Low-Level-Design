package DesignPatterns.BehavioralPattern.State.VendingMachine;

public class MoneyInsertedState extends State {
    MoneyInsertedState(VendingMachine vendingMachine) {
       super(vendingMachine);
    }

    @Override
    public void pressButton() {
        System.out.println("Dispensing item..");
        vendingMachine.setState(vendingMachine.getWaitingForMoneyState());
    }

    @Override
    public void insertMoney() {
        System.out.println("Money already inserted..");
    }
}
