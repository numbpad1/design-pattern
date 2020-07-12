package com.numbpad1.pattern.singleton;

/**
 * 线程安全的饱汉模式
 */
public class SafeFullSingleton {

    private static SafeFullSingleton instance;

    private static Object lock = new Object();

    private  SafeFullSingleton(){}

    public static SafeFullSingleton getInstance(){
        if (instance == null){
            synchronized (lock){
                //double check
                if (instance == null){
                    instance = new SafeFullSingleton();
                }
            }
        }
        return instance;
    }
}
