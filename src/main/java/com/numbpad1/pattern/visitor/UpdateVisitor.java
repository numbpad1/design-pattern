package com.numbpad1.pattern.visitor;

public class UpdateVisitor implements Visitor {

    private String status;

    public UpdateVisitor(String status) {
        this.status = status;
    }

    @Override
    public void visit(Department department) {
        if (department.getChildren().size() > 0) {
            for (Department child : department.getChildren()) {
                child.accept(this);
            }
        }
        System.out.println("将部门【" + department.getName() + "】的状态修改为：" + status);
    }
}
