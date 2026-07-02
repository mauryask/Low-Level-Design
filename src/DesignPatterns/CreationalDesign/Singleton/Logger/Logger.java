package DesignPatterns.CreationalDesign.Singleton.Logger;

/*
 * Approach01: Eager Singleton
 * Pros: Threadsafe
 * Cons: The instance is created even if it is not needed once when class loaded by JVM
 * */

//public class Logger {
//    private static final Logger INSTANCE = new Logger();
//
//    private Logger() {
//
//    }
//
//    public static Logger getInstance() {
//        return INSTANCE;
//    }
//}

/*
 * Approach02: Static Inner class (Best approach: aks. BillPughSingleton)
 * Threadsafe by default as class loading is by default threadsafe in its implementation
 * The static inner class will be loaded only once by JVM and Logger instance will be created only once
 * (When first time getInstance() is called)
 * For the next time the already created Logger instance will be returned
 * */

public class Logger {
    private Logger() {
    }

    private static class LoggerHandler {
        private static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance() {
        return LoggerHandler.INSTANCE;
    }
}
