package com.numbpad1.pattern.staticproxy;

public class SubjectImpl implements Subject{
    @Override
    public void request() {
        System.out.println("执行请求");
    }
}
