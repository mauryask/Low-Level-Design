package DesignPatterns.BehavioralPattern.State.BestExample;

public class VendingMachine {
    private MoneyInsertedState moneyInsertedState;
    private OutOfStockState outOfStockState;
    private WaitingForMoneyState waitingForMoneyState;
    private State currentState;

    VendingMachine() {
        moneyInsertedState = new MoneyInsertedState(this);
        outOfStockState = new OutOfStockState(this);
        waitingForMoneyState = new WaitingForMoneyState(this);
        currentState = waitingForMoneyState;
    }

    public MoneyInsertedState getMoneyInsertedState() {
        return moneyInsertedState;
    }

    public OutOfStockState getOutOfStockState() {
        return outOfStockState;
    }

    public WaitingForMoneyState getWaitingForMoneyState() {
        return waitingForMoneyState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void pressButton() {
        currentState.pressButton();
    }

    public void insertMoney() {
        currentState.insertMoney();
    }
}
