package com.numbpad1.pattern.staticproxy;

public class Proxy implements Subject{
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("前置操作");
        subject.request();
        System.out.println("后置操作");
    }
}
