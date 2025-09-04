package DesignPatterns.BehavioralPattern.Mediator;

// Note: this is not part of the original program, See his GitHub repo
// This abstract class defines a contract that all the users must follow.
// Enforcing consistent behavior across all users in the chat system.

// Very important: this avoids code duplication in each (different) concrete user class.
public abstract class User {
    private final String name;
    protected final ChatMediator mediator;

    User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    abstract void sendMessage(String message);

    abstract void receiveMessage(String message, User sender);
}