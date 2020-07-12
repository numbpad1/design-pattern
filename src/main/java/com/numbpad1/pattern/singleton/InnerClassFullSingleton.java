package com.numbpad1.pattern.singleton;

public class InnerClassFullSingleton {
    private InnerClassFullSingleton() {
    }

    /**
     * 饱汉模式
     *
     * 内部类只要没有被使用，就不会初始化，Signleton的实例就不会创建
     *
     * 在第一次有人调用getInstance方法的时候，内部类会初始化，instance实例会被创建，且只会执行一次。
     */
    public static class InnerHolder {
        public static final InnerClassFullSingleton instance = new InnerClassFullSingleton();
    }

    public static InnerClassFullSingleton getInstance() {
        return InnerHolder.instance;
    }
}
