package com.numbpad1.pattern.observer;

@FunctionalInterface
public interface Observer {
    void inform(String tweet);
}
