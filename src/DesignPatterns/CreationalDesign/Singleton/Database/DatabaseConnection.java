package DesignPatterns.CreationalDesign.Singleton.Database;

public class DatabaseConnection {
    /**
     * volatile keyword is must here: for threadsafe implementation
     * It ensures visibility of the variable across multiple thread
     * When one thread changes it the changes are immediately visible to all other threads
     *
     */
    private static volatile DatabaseConnection instance;

    private DatabaseConnection() {
    }

    /**
     * Below is a threadsafe implementation of creating connection object
     * It uses DCL (double-checked-locking) mechanism to prevent race condition
     */
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public void executeQuery() {
        System.out.println("Executing query..");
    }
}
