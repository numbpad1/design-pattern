package com.numbpad1.pattern.adapter;

/**
 * 适配器模式：适配老版本接口和第三方接口
 */
public class AdapterDemo {
    public static void main(String[] args) {
        OldAdapter oldAdapter = new OldAdapter();
        NewAdapter newAdapter = new NewAdapter(oldAdapter);

        newAdapter.request();
    }
}
