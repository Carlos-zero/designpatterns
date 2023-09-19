package com.example.designpatterns.strategyPattern.version_3;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence >>");
    }
}
