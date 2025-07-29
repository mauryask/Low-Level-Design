package DesignPatterns.BehavioralPattern.Mediator;

//All the chat users will be colleagues of the chat room
public class ChatUser extends User {
    public ChatUser(String name, ChatMediator mediator) {
        super(name, mediator);
    }

    public void sendMessage(String message) {
        System.out.println("******* " + this.getName() + " sending a message ******");
        this.mediator.sedMessage(message, this);
    }

    @Override
    void receiveMessage(String message, User sender) {
        System.out.println(this.getName() + " received message: " + message + " from " + sender.getName());
    }
}
