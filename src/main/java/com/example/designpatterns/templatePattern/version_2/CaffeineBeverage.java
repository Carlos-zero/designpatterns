package com.example.designpatterns.templatePattern.version_2;

/**
 * 咖啡因饮料
 * 这就是我们的抽象类，用来作为基类，其子类必须实现其操作。
 */
public abstract class CaffeineBeverage {
    // 这就是模板方法，它被声明为 final，以免子类改变这个算法的顺序。
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // 因为咖啡和茶处理这个过程的做法不同，所以这两个方法必须被声明为抽象，剩余的东西留给子类去操心
    // 这两个原语操作必须由子类实现。
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("烧开水！！！");
    }

    void pourInCup() {
        System.out.println("倒到杯子里面！！！");
    }

}
