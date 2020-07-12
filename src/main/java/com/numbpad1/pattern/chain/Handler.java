package com.numbpad1.pattern.chain;

public abstract class Handler {
    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public abstract void execute();
}
