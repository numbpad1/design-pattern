package com.numbpad1.pattern.memento;

public class Originator {
    private String state;

    public void prepare() {
        this.state = "中间数据";
    }

    public void executeA() {
        System.out.println("基于中间数据【" + state + "】进行了A方法的执行");
        state += "，A方法的结果数据";
    }

    public void executeB() {
        System.out.println("基于中间数据【" + state + "】进行了B方法的执行");
        state += "，A方法的结果数据";
    }

    public Memento createMemento() {
        return new MementoImpl(state);
    }

    public void setMemento(Memento memento) {
        MementoImpl mementoImpl = (MementoImpl) memento;
        this.state = mementoImpl.getState();
    }

    private static class MementoImpl implements Memento {

        private String state;

        public MementoImpl(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

    }
}
