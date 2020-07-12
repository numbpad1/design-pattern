package com.numbpad1.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Department> children = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public Department(String name, List<Department> children) {
        this.name = name;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getChildren() {
        return children;
    }

    public void setChildren(List<Department> children) {
        this.children = children;
    }

    public void remove(){
        if (children.size() > 0){
            for (Department child : children) {
               child.remove();
            }
        }
        System.out.println("删除"+this.name);
    }
}
