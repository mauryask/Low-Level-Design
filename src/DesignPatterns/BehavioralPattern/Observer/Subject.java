package DesignPatterns.BehavioralPattern.Observer;

public interface Subject {
    void attach(Observer obs);

    void detach(Observer obs);

    void notifyObserver();
}
