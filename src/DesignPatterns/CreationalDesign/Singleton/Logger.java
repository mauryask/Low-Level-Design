package DesignPatterns.CreationalDesign.Singleton;

public class Logger {
    private static Logger loggerInstance;

    //Make constructor private to prevent direct instantiation
    private Logger() {
    }

    //Make the method thread-safe in multithreaded environment: Even multiple threads running parallelly can create only a single instance
    public static synchronized Logger createLLoggerInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    public void info(String logMessage) {
        log("INFO", logMessage);
    }

    public void warn(String logMessage) {
        log("WARN", logMessage);
    }

    public void error(String logMessage) {
        log("ERROR", logMessage);
    }

    private void log(String logLevel, String logMessage) {
        System.out.println(System.currentTimeMillis() + " :: " + logLevel + " :: " + logMessage);
    }
}
