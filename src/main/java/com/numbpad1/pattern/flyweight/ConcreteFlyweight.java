package com.numbpad1.pattern.flyweight;

public class ConcreteFlyweight implements Flyweight{

    private String name;

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println(this.name+"执行功能逻辑");
    }


}
