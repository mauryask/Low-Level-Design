package ClassRelationships;

import static java.lang.System.out;

class Animal{
    public void eat(){
        out.println("This animal eating..");
    }
}

class Dog extends Animal{
    public void bark(){
        out.println("Dog is barking..");
    }
}

public class Inheritance {
   public static void main(String[] args){
       //'IS-A' relationship AKA Inheritance
       Dog animal = new Dog();
       animal.eat();
       animal.bark();
   }
}
