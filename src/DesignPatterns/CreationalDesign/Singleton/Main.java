package DesignPatterns.CreationalDesign.Singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.createLLoggerInstance();
        logger.info("This is sample info message..");
        logger.warn("This is sample warning message..");
        logger.error("This is sample error message..");
    }
}
