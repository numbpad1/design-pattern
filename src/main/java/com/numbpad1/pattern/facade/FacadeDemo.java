package com.numbpad1.pattern.facade;

/**
 * 门面模式：将多个内部模块调用封装在一个类中
 */
public class FacadeDemo {

    public static void main(String[] args) {
        SystemFacade systemFacade = new SystemFacade();
        systemFacade.execute();
    }


    public static class SystemFacade{

        public void execute(){
            ModuleA moduleA = new ModuleA();
            ModuleB moduleB = new ModuleB();
            ModuleC moduleC = new ModuleC();

            moduleA.execute();
            moduleB.execute();
            moduleC.execute();
        }
    }

    public static class ModuleA{
        public void execute(){
            System.out.println("子系统1的模块A功能");
        }
    }

    public static class ModuleB{
        public void execute(){
            System.out.println("子系统1的模块B功能");
        }
    }

    public static class ModuleC{
        public void execute(){
            System.out.println("子系统1的模块C功能");
        }
    }
}
