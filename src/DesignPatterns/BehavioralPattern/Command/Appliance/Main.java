package DesignPatterns.BehavioralPattern.Command.Appliance;

public class Main {
    public static void main(String[] args) {
        // Appliance
        Light livingRoomLight = new Light();
        Speaker speaker = new Speaker();
        // Commands
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        SpeakerOffCommand speakerOffCommand = new SpeakerOffCommand(speaker);
        // Interface to operate on the appliance
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOnCommand);
        remoteControl.clickButton();
        remoteControl.clickUndo();
        System.out.println("--------------------");
        remoteControl.setCommand(speakerOffCommand);
        remoteControl.clickButton();
        remoteControl.clickUndo();
    }
}
