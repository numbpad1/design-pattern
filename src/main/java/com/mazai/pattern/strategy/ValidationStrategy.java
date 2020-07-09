package com.mazai.pattern.strategy;

@FunctionalInterface
interface ValidationStrategy {
    public boolean execute(String s);
}
