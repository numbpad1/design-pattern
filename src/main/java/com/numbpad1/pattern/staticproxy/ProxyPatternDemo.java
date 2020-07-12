package com.numbpad1.pattern.staticproxy;

/**
 * 静态代理模式
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();

        Subject proxy = new Proxy(subject);
        proxy.request();
    }
}
