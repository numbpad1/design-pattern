package com.numbpad1.pattern.visitor;

@FunctionalInterface
public interface Visitor {
    void visit(Department department);
}
