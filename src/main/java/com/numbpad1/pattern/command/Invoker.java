package com.numbpad1.pattern.command;

public class Invoker {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute(){
        System.out.println("前置操作");
        command.execute();
        System.out.println("后置操作");
    }
}
