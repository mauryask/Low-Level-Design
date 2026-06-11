package DesignPatterns.CreationalDesign.Factory;

public class Main {
    public static void main(String[] args) {
        Dialog windowsDialog = new WindowsDialog();
        windowsDialog.renderButton();
    }
}
