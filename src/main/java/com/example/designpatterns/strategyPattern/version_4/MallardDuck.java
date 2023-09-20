package com.example.designpatterns.strategyPattern.version_4;

/**
 * 别忘了，因为 [MallardDuck] 继承 [Duck] 类，所以具有 [quackBehavior] 与 [flyBehavior] 实例变量。
 */
public class MallardDuck extends Duck {

    // 绿头鸭使用 [Quack] 类处理呱呱叫，所以当 [performQuack] 被调用时，叫的职责被委托给了 [Quack] 对象，而我们得到了真正的呱呱叫。
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是一只正宗的 Mallard 鸭子!!");
    }
}
