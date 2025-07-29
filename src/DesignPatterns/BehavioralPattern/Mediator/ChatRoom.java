package DesignPatterns.BehavioralPattern.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private final List<User> chatUsers;

    public ChatRoom() {
        chatUsers = new ArrayList<>();
    }

    @Override
    public void addUser(User chatUser) {
        chatUsers.add(chatUser);
    }

    @Override
    public void sedMessage(String message, User sender) {
        for (User user : chatUsers) {
            if (user != sender) {
                user.receiveMessage(message, sender);
            }
        }
    }
}
