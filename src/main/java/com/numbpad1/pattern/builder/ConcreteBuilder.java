package com.numbpad1.pattern.builder;

public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public Builder field1(String value) {
        System.out.println("在设置field1之前进行复杂的校验逻辑");
        product.setFiled1(value);
        return this;
    }

    @Override
    public Builder field2(String value) {
        System.out.println("在设置field2之前进行复杂的数据格式转换逻辑");
        product.setFiled2(value);
        return this;
    }

    public static Builder build() {
        return new ConcreteBuilder();
    }

    public Product create(){
        return product;
    }
}
