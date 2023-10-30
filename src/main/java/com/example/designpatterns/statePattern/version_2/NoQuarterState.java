package com.example.designpatterns.statePattern.version_2;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    // 我们通过构造器得到糖果机的引用，然后将它记录在实例变量中。
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    // 如果有人投入了 25分钱，我们就回应消息，并改变糖果机的状态到 HasQuarterState。
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    // 没钱就不能要求退钱
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    // 没钱也不能摇杆
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    // 没钱也不能给糖
    public void dispense() {
        System.out.println("You need to pay first");
    }

    public void refill() {
    }

    public String toString() {
        return "waiting for quarter";
    }
}