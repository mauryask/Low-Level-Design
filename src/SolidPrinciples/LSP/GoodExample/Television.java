package SolidPrinciples.LSP.GoodExample;

public class Television extends ElectronicSystem implements AudioSystem {
    @Override
    public void setVolume() {
        System.out.println("Setting up television volume..");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning television on..");
    }
}
