package DesignPatterns.BehavioralPattern.Mediator;

public class ChatUser {
    private final String name;
    private final ChatMediator chatMediator;

    public ChatUser(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String message) {
        System.out.println("******* " + this.name + " sending a message ******");
        chatMediator.sedMessage(message, this);
    }

    public String getName() {
        return name;
    }

    public void receiveMessage(String message, ChatUser sender) {
        System.out.println(this.name + " received message: '" + message + "' from " + sender.getName());
    }
}
