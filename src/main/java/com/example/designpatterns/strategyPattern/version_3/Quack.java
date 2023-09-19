package com.example.designpatterns.strategyPattern.version_3;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!!");
    }
}
