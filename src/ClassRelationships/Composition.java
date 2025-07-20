package ClassRelationships;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

//Contained class
class Engine {
    public void start() {
        out.println("Engine started..");
    }
}

//Container class
class Car {
    private final Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void drive() {
        engine.start();
        out.println("Driving the car..");
    }
}


public class Composition {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}


/*
 * Type: Strong HAS-A (Tight coupling)
 * Ownership: Container owns the contained object
 * Lifecycle: A Contained object cannot exist without a container object
 * */