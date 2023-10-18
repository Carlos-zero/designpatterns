package com.example.designpatterns.mediatorPattern.example2;

/**
 * 国家抽象类
 */
public abstract class Country {
    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
}