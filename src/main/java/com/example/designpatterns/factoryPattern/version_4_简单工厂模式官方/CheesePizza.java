package com.example.designpatterns.factoryPattern.version_4_简单工厂模式官方;

/**
 * 奶酪披萨
 */
public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";                // 规则的面皮
        sauce = "Marinara Pizza Sauce";         // Marinara披萨酱
        toppings.add("Fresh Mozzarella");       // 新鲜的芝士
        toppings.add("Parmesan");               // 帕尔马干酪
    }
}
