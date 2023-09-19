package com.example.designpatterns.strategyPattern.version_3;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!!");
    }
}
