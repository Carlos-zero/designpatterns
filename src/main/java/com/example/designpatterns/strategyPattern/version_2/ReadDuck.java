package com.example.designpatterns.strategyPattern.version_2;

public class ReadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("外观->红头鸭！");
    }
}
