package com.example.designpatterns.strategyPattern.version_2;

public class RubberDuck extends Duck{

    // 橡皮鸭子不会 ’呱呱叫‘，所以重写超类的 quack() 方法。
    @Override
    public void quack() {
        System.out.println("叫声->吱吱叫！");
    }

    @Override
    public void display() {
        System.out.println("外观->橡皮鸭！");
    }
}
