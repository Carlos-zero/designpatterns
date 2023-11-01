package com.example.designpatterns.decoratorPattern.version_1.decorator;

import com.example.designpatterns.decoratorPattern.version_1.Beverage;
import com.example.designpatterns.decoratorPattern.version_1.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}
