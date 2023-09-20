package com.example.designpatterns.strategyPattern.version_4;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞！！！");
    }
}
