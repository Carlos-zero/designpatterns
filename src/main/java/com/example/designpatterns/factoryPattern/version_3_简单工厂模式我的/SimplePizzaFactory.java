package com.example.designpatterns.factoryPattern.version_3;

/**
 * 简单工厂，将【version_2】中的实例化部分抽取出来
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else {
            pizza = new Pizza();
        }
        return pizza;
    }
}
