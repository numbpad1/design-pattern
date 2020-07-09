package com.mazai.pattern.templatemethod;

/**
 * 模版方法模式
 */
public class TemplateMethodPattern {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();
        System.out.println("========================");
        //Coffee中挂了钩子函数，消费者并不想要加额外的调味料
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
