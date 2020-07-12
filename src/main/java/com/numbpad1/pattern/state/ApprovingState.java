package com.numbpad1.pattern.state;

public class ApprovingState implements State{
    @Override
    public void execute() {
        System.out.println("执行销售出库单待审批状态的逻辑");
    }
}
