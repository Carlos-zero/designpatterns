package com.example.designpatterns.factoryPattern.version_4_简单工厂模式官方;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";                // 蛤蜊披萨
        dough = "Thin crust";               // 薄皮披萨
        sauce = "White garlic sauce";       // 白蒜酱
        toppings.add("Clams");              // 蛤蜊
        toppings.add("Grated parmesan cheese");     // 磨碎的干奶酪粉
    }
}
