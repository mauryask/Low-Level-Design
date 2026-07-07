package DesignPatterns.BehavioralPattern.State.VendingMachine;

public abstract class State {
    protected VendingMachine vendingMachine;

    public State(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public abstract void pressButton();

    public abstract void insertMoney();
}
