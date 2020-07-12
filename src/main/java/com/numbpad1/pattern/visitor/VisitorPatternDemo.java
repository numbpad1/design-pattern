package com.numbpad1.pattern.visitor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 访问者模式：是对目标对象，动态的执行某个功能而不对目标对象有任何的改动
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        Department leafDept1 = new Department("叶子部门1");
        Department leafDept2 = new Department("叶子部门2");
        Department leafDept3 = new Department("叶子部门3");

        Department subDept1 = new Department("子部门1", Arrays.asList(leafDept1, leafDept2));
        Department subDept2 = new Department("子部门2", Collections.singletonList(leafDept3));

        Department fatherDept = new Department("父部门", Arrays.asList(subDept1, subDept2));

        Visitor removeVisitor = new RemoveVisitor();
        fatherDept.accept(removeVisitor);
        System.out.println("=====================================");
        Visitor updateVisitor = new UpdateVisitor("禁用");
        fatherDept.accept(updateVisitor);

    }
}
