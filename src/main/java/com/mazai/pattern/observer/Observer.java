package com.mazai.pattern.observer;

@FunctionalInterface
public interface Observer {
    void inform(String tweet);
}
