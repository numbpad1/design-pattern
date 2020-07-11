package com.mazai.pattern.mediator;

public class ModuleC {
    private Mediator mediator;

    public ModuleC(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.setModuleC(this);
    }

    public void execute(){
        mediator.moduleCInvoke();
    }

    public void execute(String invoker){
        System.out.println(invoker+"在调用模块C的功能");
    }
}
