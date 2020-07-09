package com.mazai.pattern.templatemethod;

public abstract class CaffeineBeverage {

    //加final是为了防止子类改变父类的行为
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantCondiments()){
            addCondiments();
        }
    }

    protected abstract void addCondiments();
    protected abstract void brew();

    protected void pourInCup(){System.out.println("Pouring into cup"); };
    protected  void boilWater(){System.out.println("Boiling water"); };

    //钩子函数，钩子的存在可以让子类有能力对情况的不同点进行挂钩。
    boolean customerWantCondiments(){return true;}
}
