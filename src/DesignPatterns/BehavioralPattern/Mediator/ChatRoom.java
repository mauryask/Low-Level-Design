package DesignPatterns.BehavioralPattern.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private final List<ChatUser> chatUsers;

    public ChatRoom() {
        chatUsers = new ArrayList<>();
    }

    @Override
    public void addUser(ChatUser chatUser) {
        chatUsers.add(chatUser);
    }

    @Override
    public void sedMessage(String message, ChatUser sender) {
        for (ChatUser user : chatUsers) {
            if (user != sender) {
                user.receiveMessage(message, sender);
            }
        }
    }
}
