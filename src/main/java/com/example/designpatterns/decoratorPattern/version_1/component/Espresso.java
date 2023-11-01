package com.example.designpatterns.decoratorPattern.version_1.component;

import com.example.designpatterns.decoratorPattern.version_1.Beverage;

/**
 * 首先，让 Espresso 扩展自 Beverage 类，因为 Espresso 是一种饮料。
 */
public class Espresso extends Beverage {

    // 通过构造器设置饮料的描述，description 实例继承自 Beverage。
    public Espresso() {
        description = "Espresso";
    }

    // 最后，需要计算 Espresso 的价钱，现在不需要管调料的价钱， 直接把 Espresso 的价钱返回即可。
    public double cost() {
        return 1.99;
    }
}