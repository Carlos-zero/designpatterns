package com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Factory;

import com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.*;

/**
 * pizza 披萨原料工厂
 */
public interface PizzaIngredientFactory {

    public Dough createDough();                 // 面团

    public Sauce createSauce();                 // 调味酱汁

    public Cheese createCheese();               // 芝士，奶酪

    public Veggies[] createVeggies();           // 素菜

    public Pepperoni createPepperoni();         // 意大利辣香肠

    public Clams createClam();                  // 蛤蜊

}