package com.example.designpatterns.adapterPattern.version_1;

/**
 * 火鸡适配器
 */
public class TurkeyAdapter implements Duck {        // 首先。需要实现想转换的类型的接口
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {           // 接着，需要获取到要适配的对象的引用
        this.turkey = turkey;
    }

    public void quack() {                           // 实现目标类型的方法
        turkey.gobble();
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
