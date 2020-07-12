package com.numbpad1.pattern.bridge;

public class RefineAbstraction extends Abstraction {

    public RefineAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void execute() {
        implementor.execute();
    }
}
