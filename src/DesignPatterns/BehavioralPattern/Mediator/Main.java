package DesignPatterns.BehavioralPattern.Mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();
        //Define users
        ChatUser tony = new ChatUser("Tony Stark" /*User name*/, chatRoom/*Chat room the user belongs*/);
        ChatUser bruce = new ChatUser("Bruce Banner", chatRoom);
        ChatUser steve = new ChatUser("Steve Rogers", chatRoom);

        //Add users in chat room
        chatRoom.addUser(tony);
        chatRoom.addUser(bruce);
        chatRoom.addUser(steve);
        tony.sendMessage("Hey, folks!!");
        bruce.sendMessage("Yo!! whats up!!");
    }
}
