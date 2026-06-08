package DesignPatterns.BehavioralPattern.Mediator.ChatRoom;

//Mediator
public interface ChatMediator {
    void addUser(User chatUser);
    void sedMessage(String message, User sender);
}
