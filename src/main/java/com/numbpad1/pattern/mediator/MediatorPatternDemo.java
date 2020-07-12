package com.numbpad1.pattern.mediator;

/**
 * 中介者模式:让互相调用的模块之间解耦合
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        ModuleA moduleA = new ModuleA(mediator);
        ModuleB moduleB = new ModuleB(mediator);
        ModuleC moduleC = new ModuleC(mediator);

        //好处在哪？
        //模块A只需要知道一个中介者就可以了，具体跟其他的交互都封装到了中介者里面了
        //模块B同上
        //模块C同上
        //模块A、B、C不再由复杂的交互关系，互相之间修改不会对对方产生什么影响。

        moduleA.execute();
        moduleB.execute();
        moduleC.execute();
    }
}
