package com.numbpad1.pattern.state;

/**
 * 状态模式：状态的流转
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new NewState());
        context.execute(1);
        context.execute(2);
        context.execute(3);
    }
}
