package com.example.designpatterns.strategyPattern.version_3;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!!");
    }
}
