package com.mazai.pattern.templatemethod;

public class Coffee extends CaffeineBeverage{

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and mi");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
