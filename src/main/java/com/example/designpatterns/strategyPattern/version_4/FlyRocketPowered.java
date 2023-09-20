package com.example.designpatterns.strategyPattern.version_4;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我能够利用火箭动力飞翔！！！");
    }
}
