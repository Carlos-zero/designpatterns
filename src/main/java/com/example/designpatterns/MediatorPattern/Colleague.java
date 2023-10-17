package com.example.designpatterns.MediatorPattern;

/**
 * 抽象同事类
 */
abstract class Colleague {
    protected Mediator mediator;

    // 构造方法，得到中介者对象
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
