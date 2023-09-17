package com.example.designpatterns.strategyPattern.version_1;

public abstract class Duck {
    public Duck() {
        System.out.println("------------------------------------");
        display();
        quack();
        swim();
        System.out.println("------------------------------------");
    }

    abstract public void display();

    public void quack() {
        System.out.println("叫声->呱呱！");
    }

    public void swim() {
        System.out.println("泳姿->水上漂！");
    }
}
