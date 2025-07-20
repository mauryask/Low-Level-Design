package ClassRelationships;

import static java.lang.System.out;

//Super class/Base class
class Animal {
    public void eat() {
        out.println("This animal eating..");
    }
}

//Subclass/child class
class Dog extends Animal {
    public void bark() {
        out.println("Dog is barking..");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //'IS-A' relationship AKA Inheritance: Dog IS-A animal
        Dog animal = new Dog();
        animal.eat();
        animal.bark();
    }
}

/*
 * Type: IS-A
 * Ownership: No class owns object of another class
 * Lifecycle: Both classes can live independently
 * */