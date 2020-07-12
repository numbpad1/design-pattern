package com.numbpad1.pattern.adapter;

public class NewAdapter implements Target{

    private OldAdapter oldAdapter;

    public NewAdapter(OldAdapter oldAdapter) {
        this.oldAdapter = oldAdapter;
    }

    @Override
    public void request() {
        oldAdapter.specificRequest();
    }
}
