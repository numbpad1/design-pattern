package com.numbpad1.pattern.decorator;

/**
 * 装饰器模式
 *
 * 常见于Java IO类
 *
 *
 还有就是spring的aop，aop这块基于动态代理的概念，装饰我们的目标对象然后加入事务控制、日志打印之类的功能。
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator = new Decorator(component);
        decorator.execute();
    }
}
