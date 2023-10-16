package com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Factory;

import com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.*;
import com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.*;

/**
 * 芝加哥原料工厂
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(), new Spinach(), new Eggplant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}