package com.mazai.pattern.mediator;

public class ModuleB {

    private Mediator mediator;

    public ModuleB(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.setModuleB(this);
    }

    public void execute(){
        mediator.moduleBInvoke();
    }

    public void execute(String invoker){
        System.out.println(invoker+"在调用模块B的功能");
    }
}
