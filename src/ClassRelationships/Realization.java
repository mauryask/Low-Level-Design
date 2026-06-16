package ClassRelationships;

// The Interface (The Contract)
interface Lockable {
    void lock();    // Abstract method: What it does

    void unlock();  // Abstract method: What it does
}

// The Realizing Class
class SmartPhone implements Lockable {
    private boolean isLocked = false;

    // REALIZATION: Providing the concrete implementation
    @Override
    public void lock() {
        this.isLocked = true;
        System.out.println("Phone screen turned off and locked.");
    }

    @Override
    public void unlock() {
        this.isLocked = false;
        System.out.println("Phone scanned face and unlocked.");
    }
}

public class Realization {
    public static void main(String[] args) {

    }
}

/**
 * Realization is the UML term for implementing an interface.
 * It represents a relationship where a class promises to fulfill a contract or
 * "realize" the behavior defined by an interface.It is a specific variation
 * of inheritance, but instead of inheriting existing code (like regular inheritance),
 * the class inherits obligations to write new code
 */