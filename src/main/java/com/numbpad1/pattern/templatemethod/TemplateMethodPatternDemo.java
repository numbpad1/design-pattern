package com.numbpad1.pattern.templatemethod;

/**
 * 模版方法模式:将部分特殊实现交给子类
 */
public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
        System.out.println("========================");
        //Coffee中挂了钩子函数，消费者并不想要加额外的调味料
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
