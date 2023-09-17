package com.example.designpatterns.strategyPattern.version_2;

// 所有鸭子都会飞 不正常
public abstract class Duck {
    public Duck() {
        System.out.println("------------------------------------");
        display();
        quack();
        swim();
        fly();
        System.out.println("------------------------------------");
    }

    abstract public void display();

    public void quack() {
        System.out.println("叫声->呱呱叫！");
    }

    public void swim() {
        System.out.println("泳姿->水上漂！");
    }

    public void fly() {
        System.out.println("飞翔->会飞的鸭！");
    }
}
