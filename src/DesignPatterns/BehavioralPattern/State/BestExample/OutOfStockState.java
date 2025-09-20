package DesignPatterns.BehavioralPattern.State.BestExample;

public class OutOfStockState implements State {
    private VendingMachine machine;

    OutOfStockState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void pressButton() {
        System.out.println("Out of stock..");
    }

    @Override
    public void insertMoney() {
        System.out.println("Can't insert money, as the item is out of stock..");
    }
}
