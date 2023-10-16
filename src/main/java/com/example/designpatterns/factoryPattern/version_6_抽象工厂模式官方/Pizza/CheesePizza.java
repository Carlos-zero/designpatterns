package com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza;

import com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Factory.*;

/**
 * 芝士Pizza
 */
public class CheesePizza extends Pizza {
    // 依赖一个ingredient工厂，用来准备制作Pizza的原料
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    // 实现抽象类的prepare函数，通过原料工厂准备原料
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}