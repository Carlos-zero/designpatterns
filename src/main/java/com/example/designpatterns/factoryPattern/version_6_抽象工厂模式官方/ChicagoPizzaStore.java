package com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方;

import com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Factory.ChicagoPizzaIngredientFactory;
import com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Factory.PizzaIngredientFactory;
import com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        }
        return pizza;
    }
}