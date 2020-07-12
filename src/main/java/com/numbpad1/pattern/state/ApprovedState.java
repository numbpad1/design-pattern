package com.numbpad1.pattern.state;

public class ApprovedState implements State {
    @Override
    public void execute() {
        System.out.println("执行销售出库单已审批状态的逻辑");
    }
}
