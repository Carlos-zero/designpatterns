package com.example.designpatterns.strategyPattern.version_4;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak 的叫!!");
    }
}
