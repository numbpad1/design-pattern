package com.numbpad1.pattern.composite;

import java.util.Arrays;
import java.util.Collections;

/**
 * 组合模式
 *
 * 组合模式的第一要义，就是将树形结构的数据，用一个类或者少数一两个类就可以拼成一颗🌲的形状
 * 组合模式的第二要以，就是直接对一个父级的部门执行某个操作，这个操作会直接递归调用所有下层的自数据的相关操作
 * 通过这个树形结构递归自己的方式就将一棵树的操作完美的执行了。
 *
 * 好处就是对数据的操作，不需要调用if for的代码去执行
 * if(list.size > 0){
 *     for(Object obj:list){
 *         .....
 *     }
 * }
 */
public class CompositePatternDemo {

    public static void main(String[] args) {
        Department leafDept1 = new Department("叶子部门1");
        Department leafDept2 = new Department("叶子部门2");
        Department leafDept3 = new Department("叶子部门3");

        Department subDept1 = new Department("子部门1", Arrays.asList(leafDept1, leafDept2));
        Department subDept2 = new Department("子部门2", Collections.singletonList(leafDept3));

        Department fatherDept = new Department("父部门", Arrays.asList(subDept1, subDept2));

        fatherDept.remove();
    }
}
