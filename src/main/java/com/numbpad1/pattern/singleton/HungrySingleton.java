package com.numbpad1.pattern.singleton;

/**
 * 饿汉模式
 */
public class HungrySingleton {

    /**
     * 第一步：直接将这个类的实例创建出来，赋予static final修饰的 变量
     */
    private final static  HungrySingleton instance = new HungrySingleton();

    /**
     * 第二步：将构造函数搞成private私有的
     *
     * 此时除了这个类自己本身，其他任何人都不能创建它的这个实例对象
     */
    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return instance;
    }
}
