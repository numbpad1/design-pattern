package com.numbpad1.pattern.strategy;

@FunctionalInterface
interface ValidationStrategy {
    public boolean execute(String s);
}
