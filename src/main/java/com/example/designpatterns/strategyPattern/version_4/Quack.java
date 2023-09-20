package com.example.designpatterns.strategyPattern.version_4;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack quack 的叫!!");
    }
}
