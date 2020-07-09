package com.mazai.pattern.templatemethod;

public class Tea extends CaffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }


    @Override
    protected void brew() {
        System.out.println("Steeping the bag");
    }
}
