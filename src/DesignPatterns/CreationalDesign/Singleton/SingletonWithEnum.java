package DesignPatterns.CreationalDesign.Singleton;

/*
 * Best Singleton Design Pattern Implementation
 * */

enum EnumSingleton {
    INSTANCE;

    private String appConfig = "DEFAULT_CONFIG";

    public String getAppConfig() {
        return appConfig;
    }

    public void setAppConfig(String appConfig) {
        this.appConfig = appConfig;
    }
}

public class SingletonWithEnum {
    public static void main(String[] args) {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println(instance1 == instance2);
        instance1.setAppConfig("NEW_CONFIG");
        System.out.println(instance2.getAppConfig());
    }
}
