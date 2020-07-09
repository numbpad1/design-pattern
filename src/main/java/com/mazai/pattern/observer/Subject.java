package com.mazai.pattern.observer;

public interface Subject {
    void registerObserver(Observer o);
    void notifyObservers(String tweet);
}
