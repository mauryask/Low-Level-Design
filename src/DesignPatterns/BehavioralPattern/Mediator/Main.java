package DesignPatterns.BehavioralPattern.Mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();
        ChatUser tony = new ChatUser("Tony Stark", chatRoom);
        ChatUser bruce = new ChatUser("Bruce Banner", chatRoom);
        ChatUser steve = new ChatUser("Steve Rogers", chatRoom);
        chatRoom.addUser(tony);
        chatRoom.addUser(bruce);
        chatRoom.addUser(steve);
        tony.sendMessage("Hey, folks!!");
    }
}
