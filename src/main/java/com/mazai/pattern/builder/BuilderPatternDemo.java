package com.mazai.pattern.builder;

/**
 * 构建器模式
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Product product = builder.field1("hello").field2("world").create();
        System.out.println(product);

    }
}