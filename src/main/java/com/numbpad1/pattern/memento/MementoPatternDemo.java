package com.numbpad1.pattern.memento;

/**
 * 备忘录模式：将中间数据暂存之后再恢复
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();

        // 准备好了中间数据
        originator.prepare();
        // 将中间数据保存到备忘录中去
        Memento memento = originator.createMemento();
        // 将备忘录保存到备忘录管理器中去
        Caretaker caretaker = new Caretaker();
        caretaker.saveMemento(memento);
        // 基于中间数据执行了A方法，但是此时中间数据已经改变了
        originator.executeA();
        // 从备忘录管理器中获取备忘录
        memento = caretaker.retrieveMemento();
        // 将备忘录中保存好的中间数据重新设置到原发器中去，就将中间数据恢复成了之前备忘的状态
        originator.setMemento(memento);
        // 接着再次执行方法B
        originator.executeB();

        //面临的场景
        //你的系统会生产出来一份中间数据，这份中间数据要么是没法一直在内存里保留，要么可能会被修改
        //所以逼得你迫不得已，必须通过备忘录的方式，将中间数据暂存一份。
        //在一堆操作过后，可能之间内存中的中间数据都丢失了，也可能这份中间数据被人篡改了
        //接下来，你需要从备忘录中恢复我们的中间数据、
        //基于恢复后的中间数据，再次执行后面的操作
    }
}
