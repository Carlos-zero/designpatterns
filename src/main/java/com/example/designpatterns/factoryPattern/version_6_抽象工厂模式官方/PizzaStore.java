package com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方;

import com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza;

/**
 * PizzaStore 还是保持工厂方法模式的样式，由工厂类提供披萨，自己进行后续处理
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
