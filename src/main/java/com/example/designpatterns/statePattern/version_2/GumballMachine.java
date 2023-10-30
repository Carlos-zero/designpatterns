package com.example.designpatterns.statePattern.version_2;

public class GumballMachine {

    /*
        不再使用静态整数代码状态，而是由具体的类代表状态；
        所有的状态对象都是在构造器中创建并赋值。
     */ State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    // 这个实例变量现在持有一个状态对象，而不是一个整数
    State state;
    int count = 0;

    // 构造器取得糖果数量，并把他放到一个实例变量中；
    // 每一种状态也都创建了一个状态实例
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    /*
     现在这些动作都变得容易实现了，都委托到具体的状态去实现
     */
    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }


    // 我们不需要准备一个 dispense() 的动作方法，因为这只是一个内部的动作，用户不可以直接要求机器发糖果。
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    // 使用这个辅助方法来释放糖果，并将其数量-1
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
        state.refill();
    }

    void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
