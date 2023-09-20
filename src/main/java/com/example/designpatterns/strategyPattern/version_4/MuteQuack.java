package com.example.designpatterns.strategyPattern.version_4;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我是一只不会叫的鸭子！！！");
    }
}
