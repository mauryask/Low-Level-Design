package DesignPatterns.BehavioralPattern.Mediator;

public interface ChatMediator {
    void addUser(ChatUser chatUser);
    void sedMessage(String message, ChatUser sender);
}
