package com.mazai.pattern.mediator;

public class Mediator {
    private ModuleA moduleA;
    private ModuleB moduleB;
    private ModuleC moduleC;

    public ModuleA getModuleA() {
        return moduleA;
    }

    public void setModuleA(ModuleA moduleA) {
        this.moduleA = moduleA;
    }

    public ModuleB getModuleB() {
        return moduleB;
    }

    public void setModuleB(ModuleB moduleB) {
        this.moduleB = moduleB;
    }

    public ModuleC getModuleC() {
        return moduleC;
    }

    public void setModuleC(ModuleC moduleC) {
        this.moduleC = moduleC;
    }

    public void moduleAInvoke() {
        moduleB.execute("模块A通知中介者");
        moduleC.execute("模块A通知中介者");
    }

    public void moduleBInvoke() {
        moduleA.execute("模块B通知中介者");
        moduleC.execute("模块B通知中介者");
    }

    public void moduleCInvoke() {
        moduleA.execute("模块C通知中介者");
        moduleB.execute("模块B通知中介者");
    }


}
