package com.mazai.pattern.strategy;

/**
 * 策略模式
 */
public class StrategyPatternTest {
    public static void main(String[] args) {
        Validator isAllLowerCase = new Validator(new IsAllLowerCase());
        System.out.println(isAllLowerCase.validate("aaaa"));
        Validator isNumeric = new Validator(new IsNumeric());
        System.out.println(isNumeric.validate("aaaa"));

        //with lambdas
        Validator isAllLowerCaseWithLambdas = new Validator(s -> s.matches("[a-z]+"));
        System.out.println(isAllLowerCaseWithLambdas.validate("aaa"));
        Validator isNumericWithLambdas = new Validator(s -> s.matches("\\d+"));
        System.out.println(isNumericWithLambdas.validate("aaaa"));
    }
}

