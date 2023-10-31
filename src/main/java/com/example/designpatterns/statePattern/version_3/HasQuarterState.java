package com.example.designpatterns.statePattern.version_3;

import java.util.Random;

public class HasQuarterState implements State {
    // 首先我们增加一个随机数产生器，产生10%赢的机会
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        // 然后决定这个顾客是否赢了
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            // 如果赢了，而且有足够的糖果可以让它一次得到两颗的话，进入WinnerState状态
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            // 否则就进入 SoldState 状态
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public void refill() {
    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
