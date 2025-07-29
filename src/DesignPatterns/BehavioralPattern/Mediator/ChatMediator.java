package DesignPatterns.BehavioralPattern.Mediator;

//Mediator
public interface ChatMediator {
    void addUser(User chatUser);
    void sedMessage(String message, User sender);
}
