package com.numbpad1.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<String, Flyweight> cachePool = new HashMap<>();

    public static Flyweight get(String name) {
        Flyweight flyweight = cachePool.get(name);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(name);
            cachePool.put(name, flyweight);
        }
        return flyweight;
    }
}
