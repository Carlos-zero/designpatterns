package com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Factory;

import com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.*;
import com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.*;

/**
 * 纽约原料工厂
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
