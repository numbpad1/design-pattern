package com.numbpad1.pattern.state;

public class FinishedState implements State{
    @Override
    public void execute() {
        System.out.println("执行销售出库单已完成状态的逻辑");
    }
}
