package com.numbpad1.pattern.command;

/**
 * 命令模式
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Command commandA = new CommandA();
        Command commandB = new CommandB();

        Invoker invoker = new Invoker();
        invoker.setCommand(commandA);
        invoker.execute();
        invoker.setCommand(commandB);
        invoker.execute();
    }
}
