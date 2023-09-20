package com.example.designpatterns.strategyPattern.version_4;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我会飞!!");
    }
}
