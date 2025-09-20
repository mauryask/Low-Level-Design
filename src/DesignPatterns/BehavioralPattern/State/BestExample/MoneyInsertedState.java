package DesignPatterns.BehavioralPattern.State.BestExample;

public class MoneyInsertedState implements State {
    private final VendingMachine machine;

    MoneyInsertedState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void pressButton() {
        System.out.println("Dispensing item..");
        machine.setState(machine.getWaitingForMoneyState());
    }

    @Override
    public void insertMoney() {
        System.out.println("Money already inserted..");
    }
}
