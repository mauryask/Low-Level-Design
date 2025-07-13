package DesignPatterns.CreationalDesign.Factory;

//Factory class: handling the object creation logic here
public class TransportService {
    public static Transport getTransport(String transportType) {
        if (transportType == null || transportType.isEmpty()) {
            return null;
        }

        return switch (transportType) {
            case "car" -> new Car();
            case "bus" -> new Bus();
            case "truck" -> new Truck();
            default -> throw new IllegalArgumentException("Unsupported transport type: " + transportType);
        };
    }
}
