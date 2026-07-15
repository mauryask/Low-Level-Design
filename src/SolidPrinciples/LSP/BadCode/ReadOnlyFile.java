package SolidPrinciples.LSP.BadCode;

/*
*  The Liskov Substitution Principle (LSP) states that objects of a superclass
*  should be replaceable with objects of its subclasses without breaking the
*  application. Derived classes must preserve the behavior and contracts expected
*  of their base classes so that client code can use them
*  interchangeably without knowing which specific subclass is being used
* */

// Violation of LSP as the Read-only file should not be written at all
public class ReadOnlyFile extends File {
    //This function violating LSP
    @Override
    public void write() {
        //Can be handled like this but not a good idea
        throw new UnsupportedOperationException("Unsupported operation!!");
    }

    @Override
    public void read() {
        System.out.println("File is being read...");
    }
}
