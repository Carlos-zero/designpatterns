package com.example.designpatterns.proxyPattern.version_1.state;

import com.example.designpatterns.proxyPattern.version_1.GumballMachine;

/**
 * 没有25美分硬币的状态
 */
public class NoQuarterState implements State {
    private static final long serialVersionUID = 2L;

    // 对于 State 的每个实现，我们都在 GumballMachine 实例变量前加上 transient 关键字，这样就告诉 JVM 不要序列化这个字段了。
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public String toString() {
        return "waiting for quarter";
    }
}