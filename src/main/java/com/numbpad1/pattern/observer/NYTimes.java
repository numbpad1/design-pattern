package com.numbpad1.pattern.observer;

public class NYTimes implements Observer{
    @Override
    public void inform(String tweet) {
        if (tweet != null && tweet.contains("money")){
            System.out.println("Breaking news in NY" + tweet);
        }
    }
}
