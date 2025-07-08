package DesignPatterns.BehavioralPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private double temperature;
    private final List<Observer> observerList;

    public WeatherStation() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void attach(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(temperature);
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObserver();
    }
}
