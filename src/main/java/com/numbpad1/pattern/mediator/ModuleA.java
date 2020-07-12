package com.numbpad1.pattern.mediator;

public class ModuleA {
    private Mediator mediator;

    public ModuleA(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.setModuleA(this);
    }

    public void execute(){
        mediator.moduleAInvoke();
    }

    public void execute(String invoker){
        System.out.println(invoker+"在调用模块A的功能");
    }
}
