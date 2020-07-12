package com.numbpad1.pattern.decorator;

public class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void execute() {
        System.out.println("在执行基础功能之前，实现部分功能增强");
        component.execute();
        System.out.println("在实现基础功能之后，实现部分功能增强");
    }
}
