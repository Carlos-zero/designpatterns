package com.example.designpatterns.decoratorPattern.version_1;

/**
 * 装饰者基类
 * 首先，必须要 CondimentDecorator 能取代 Beverage，所以 CondimentDecorator 扩展自 Beverage 类。
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    // 所有的调料装饰者都必须重新实现 getDescription() 方法。
    public abstract String getDescription();
}
