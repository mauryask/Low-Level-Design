package DesignPatterns.CreationalDesign.Singleton.Database;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection = DatabaseConnection.getInstance();
    }
}
