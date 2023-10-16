package com.example.designpatterns.factoryPattern.version_4_简单工厂模式官方;

/**
 * 奶酪披萨
 */
public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Cheese com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza";
        dough = "Regular Crust";                // 规则的面皮
        sauce = "Marinara com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Sauce";         // Marinara披萨酱
        toppings.add("Fresh Mozzarella");       // 新鲜的芝士
        toppings.add("Parmesan");               // 帕尔马干酪
    }
}
