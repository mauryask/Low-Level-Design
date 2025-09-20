package DesignPatterns.BehavioralPattern.State.BestExample;

public class WaitingForMoneyState implements State {
    private final VendingMachine machine;

    WaitingForMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void pressButton() {
        System.out.println("Insert money first..");
    }

    @Override
    public void insertMoney() {
        System.out.println("Money inserted..");
        machine.setState(machine.getMoneyInsertedState());
    }
}
