package com.numbpad1.pattern.chain;

public class Handler2 extends Handler {

    public Handler2(Handler successor) {
        super(successor);
    }

    @Override
    public void execute() {
        System.out.println("执行功能2");
        if (successor != null) {
            successor.execute();
        }
    }
}