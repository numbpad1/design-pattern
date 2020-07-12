package com.numbpad1.pattern.visitor;

public class RemoveVisitor implements Visitor {
    @Override
    public void visit(Department department) {
        if (department.getChildren().size() > 0){
            for (Department child : department.getChildren()) {
                child.accept(this);
            }
        }
        System.out.println("删除部门【" + department.getName() + "】");
    }
}
