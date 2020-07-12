package com.numbpad1.pattern.chain;

public class Handler3 extends Handler {
    public Handler3(Handler successor) {
        super(successor);
    }

    @Override
    public void execute() {
        System.out.println("执行功能3");
        if (successor != null) {
            successor.execute();
        }
    }
}
