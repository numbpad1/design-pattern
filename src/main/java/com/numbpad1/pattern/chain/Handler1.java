package com.numbpad1.pattern.chain;

public class Handler1 extends Handler {
    public Handler1(Handler successor) {
        super(successor);
    }

    @Override
    public void execute() {
        System.out.println("执行功能1");
        if (successor != null) {
            successor.execute();
        }
    }
}
