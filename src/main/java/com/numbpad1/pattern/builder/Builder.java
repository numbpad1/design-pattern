package com.numbpad1.pattern.builder;

public interface Builder {
    Builder field1(String value);
    Builder field2(String value);
    Product create();
}
