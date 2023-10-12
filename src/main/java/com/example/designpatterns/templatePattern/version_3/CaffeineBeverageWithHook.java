package com.example.designpatterns.templatePattern.version_3;

/**
 * 对模板方法进行挂钩
 */
public abstract class CaffeineBeverageWithHook {
    // 这就是模板方法，它被声明为 final，以免子类改变这个算法的顺序。
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        // 利用钩子改变算法步骤
        if (customerWantsCondiments()) {
            addCondiments();
        }
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

    // 这就是一个钩子，子类可以覆盖这个方法，但不见得一定要这么做。
    boolean customerWantsCondiments() {
        return true;
    }
}
