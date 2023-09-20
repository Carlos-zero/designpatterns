package com.example.designpatterns.strategyPattern.version_4;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("------------------------------------");
        Duck model = new ModelDuck();
        // 第一次调用 performFly() 会被委托给 flyBehavior 对象（也就是 FlyNoWay 实例），该对象是在模型鸭的构造函数中设置的。
        model.performFly();
        // 这会调用继承来的 setter 方法，把火箭动力飞行的行为设定到模型鸭中，
        model.setFlyBehavior(new FlyRocketPowered());
        // 如果成功，就意味着模型鸭可以动态地改变它的飞行行为。如果把行为的实现绑死在鸭子类中，可就无法做到这样了
        model.performFly();
        System.out.println("------------------------------------");
    }
}
