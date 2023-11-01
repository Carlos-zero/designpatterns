package com.example.designpatterns.decoratorPattern.version_1.component;

import com.example.designpatterns.decoratorPattern.version_1.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}