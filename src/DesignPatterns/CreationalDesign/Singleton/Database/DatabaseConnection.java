package DesignPatterns.CreationalDesign.Singleton.Database;

public class DatabaseConnection {
    /**
     * volatile keyword is must here: for threadsafe implementation
     * It ensures visibility of the variable across multiple thread
     * When one thread changes it the changes are immediately visible to all other threads
     * -----------------------------------------------------------------------------------
     * The volatile keyword in Java guarantees visibility and prevents instruction
     * reordering for shared variables across threads. It ensures that any thread reading the variable gets
     * the most recent value directly from main memory instead of a thread-specific local cache.
     */
    private static volatile DatabaseConnection instance;

    private DatabaseConnection() {
    }

    /**
     * Below is a threadsafe implementation of creating connection object
     * It uses DCL (double-checked-locking) mechanism to prevent race condition
     * -----------------------------------------------------------------------
     ** Why Both Checks Are Necessary
     * First Check: Avoids the expensive synchronized block
     * once the instance is already created, ensuring high performance.
     * Second Check: Prevents a race condition. If Thread A and Thread B both pass the first check
     * simultaneously, Thread A enters the lock and creates
     * the instance. When Thread B enters next, the second check stops it from creating a duplicate instance.
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
