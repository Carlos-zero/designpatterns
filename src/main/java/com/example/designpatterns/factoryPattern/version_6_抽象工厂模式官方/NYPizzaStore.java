package com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方;

import com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Factory.NYPizzaIngredientFactory;
import com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Factory.PizzaIngredientFactory;
import com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.*;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;

        // 纽约店会用到纽约披萨原料工厂，由该原料工厂负责生产所有纽约风味披萨所需的原料
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {

            // 把工厂传递给每一个披萨，以便披萨能从工厂中获取原料
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Cheese com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Pepperoni com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza");

        }
        return pizza;
    }
}
