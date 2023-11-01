package com.example.designpatterns.decoratorPattern.version_1.decorator;

import com.example.designpatterns.decoratorPattern.version_1.Beverage;
import com.example.designpatterns.decoratorPattern.version_1.CondimentDecorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
