package DesignPatterns.BehavioralPattern.Observer;

//Observer Pattern AKA Publisher Subscriber Pattern
public class Main {
    public static void main(String[] args) {
        //Publisher
        WeatherStation weatherStation = new WeatherStation();
        //Subscribers (Observers)
        Observer mobileDevice = new MobileDevice("Galaxy S25 Ultra");
        Observer smartTV = new SmartTVs("Samsung Smart Monitor M5");
        //Attach observers
        weatherStation.attach(mobileDevice);
        weatherStation.attach(smartTV);
        //Set temperature
        weatherStation.setTemperature(25);
        //Detach an observer
        weatherStation.detach(smartTV);
        weatherStation.setTemperature(42);
    }
}
