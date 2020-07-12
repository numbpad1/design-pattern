package com.numbpad1.pattern.command;

public class CommandA implements Command{
    @Override
    public void execute() {
        System.out.println("commandB execute..... ");
    }
}
