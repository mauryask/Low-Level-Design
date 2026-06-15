package DesignPatterns.Structural.Composite.OrderComponent;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Box implements OrderComponent {
    private final List<OrderComponent> children = new ArrayList<>();

    public void addChild(OrderComponent component) {
        children.add(component);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (OrderComponent component : children) {
            total += component.getPrice();
        }
        return total;
    }
}
