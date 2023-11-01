package com.example.designpatterns.decoratorPattern.version_1;

/**
 * 被装饰对象的基类
 */
public abstract class Beverage {
    //
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
