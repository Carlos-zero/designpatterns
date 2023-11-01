package com.example.designpatterns.decoratorPattern.version_1.component;

import com.example.designpatterns.decoratorPattern.version_1.Beverage;

/**
 * 这是另一种饮料，做法和 Espresso 相同。
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}