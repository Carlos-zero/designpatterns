package com.example.designpatterns.strategyPattern.version_4;

public class ModelDuck extends Duck{
    public ModelDuck() {
        // 一开始，我们的模型鸭是不会飞的
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是一个模型鸭！！！");
    }
}
