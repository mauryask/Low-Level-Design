package DesignPatterns.Structural.Composite.OrderComponent;

public class Main {
    public static void main(String[] args) {
        OrderComponent hammer = new Product("Hammer", 10.98);
        OrderComponent phone = new Product("Phone", 456.04);
        OrderComponent charger = new Product("Charger", 12.34);

        //Small box
        Box smallBox = new Box();
        smallBox.addChild(hammer);

        // Master box
        Box masterBox = new Box();
        masterBox.addChild(smallBox);
        masterBox.addChild(phone);
        masterBox.addChild(charger);

        System.out.println("Price: " + masterBox.getPrice());
    }
}
