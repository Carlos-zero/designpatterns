package com.example.designpatterns.strategyPattern.version_4;

/**
 * Duck 对象只要叫 [quackBehavior] 对象去【呱呱叫】就可与了，在这部分代码中，我们不在乎 [quackBehavior] 接口的对象到底是什么，我们只关心该对象知道如何进行【呱呱叫】就够了。
 */
public abstract class Duck {
    // 行为变量被声明为【接口】类型，
    // 而不是具体的实现类型，每个鸭子对象都会动态的设置这些变量以在运行时引用正确的行为类型。
    // 每只鸭子都会引用实现 【QuackBehavior】接口的对象。
    QuackBehavior quackBehavior;

    FlyBehavior flyBehavior;


    public Duck() {
        display();
        swim();
    }

    abstract public void display();

    // 鸭子对象不亲自处理【呱呱叫】的行为，而是委托给quackBehavior[quackBehavior]引用的对象。
    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("漂浮在水面上。");
    }

    // 通过这两个 setter 函数，我们可以随时调用这两个方法改变鸭子的行为

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }
}


