package com.numbpad1.pattern.builder;

public class Product {
    private String filed1;
    private String filed2;

    public String getFiled1() {
        return filed1;
    }

    public void setFiled1(String filed1) {
        this.filed1 = filed1;
    }

    public String getFiled2() {
        return filed2;
    }

    public void setFiled2(String filed2) {
        this.filed2 = filed2;
    }

    @Override
    public String toString() {
        return "Product{" +
                "filed1='" + filed1 + '\'' +
                ", filed2='" + filed2 + '\'' +
                '}';
    }
}
