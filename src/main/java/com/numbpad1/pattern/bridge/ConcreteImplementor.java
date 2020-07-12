package com.numbpad1.pattern.bridge;

public class ConcreteImplementor implements Implementor{
    @Override
    public void execute() {
        System.out.println("执行了功能逻辑");
    }
}
