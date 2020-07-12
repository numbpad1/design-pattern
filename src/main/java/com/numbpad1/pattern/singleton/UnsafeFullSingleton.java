package com.numbpad1.pattern.singleton;

/**
 * 线程不安全的饱汉模式
 *
 * 线程不安全的，
 */
public class UnsafeFullSingleton {
    private static UnsafeFullSingleton instance;

    private UnsafeFullSingleton(){}

    public static UnsafeFullSingleton getInstance(){
        if (instance == null){
            //有可能会出现两个线程并发执行，同时创建两次对象的情况
            return new UnsafeFullSingleton();
        }else {
            return instance;
        }
    }
}
