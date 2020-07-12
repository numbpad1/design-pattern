package com.numbpad1.pattern.strategy;

public class IsNumeric implements ValidationStrategy {
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}