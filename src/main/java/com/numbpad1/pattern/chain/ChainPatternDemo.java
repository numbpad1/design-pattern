package com.numbpad1.pattern.chain;

public class ChainPatternDemo {
    public static void main(String[] args) {

        //业务流程1
        Handler thirdHandler = new Handler3(null);
        Handler secondHandler = new Handler2(thirdHandler);
        Handler firstHandler = new Handler1(secondHandler);
        firstHandler.execute();
        System.out.println("===============================");
        //业务流程2
        thirdHandler = new Handler3(null);
        secondHandler = new Handler1(thirdHandler);
        firstHandler = new Handler2(secondHandler);
        firstHandler.execute();
        //责任链思想
        //1：将一个业务流程中的多个步骤拆分开来，每个步骤封装到一个handler中去
        //2：支持业务流程基于handler动态组装，不同的业务流程-> handler代表的代码组建可以复用

        //好处1：将这个业务封装到handler中，后面如果要对某个步骤的代码逻辑调整，修改一个handler即可
        //好处2：如果业务流程要修改，那么不需要拷贝大量的代码逻辑，只要基于handler动态组装业务流程即可

        //面向的场景
        //有多个业务流程，这些业务流程之间有相同的代码逻辑和步骤
        //可以用责任链模式来实现
    }
}
