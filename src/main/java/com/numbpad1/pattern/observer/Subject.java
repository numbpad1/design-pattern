package com.numbpad1.pattern.observer;

public interface Subject {
    void registerObserver(Observer o);
    void notifyObservers(String tweet);
}
