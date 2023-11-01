package com.example.designpatterns.decoratorPattern.version_1.component;

import com.example.designpatterns.decoratorPattern.version_1.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}