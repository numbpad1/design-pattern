package com.numbpad1.pattern.decorator;

public class ConcreteComponent implements Component{
    @Override
    public void execute() {
        System.out.println("基础功能");
    }
}
