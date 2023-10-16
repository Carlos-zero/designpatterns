package com.example.designpatterns.factoryPattern.version_4_简单工厂模式官方;

/**
 * 意大利辣香肠披萨
 */
public class PepperoniPizza extends Pizza {
	public PepperoniPizza() {
		name = "com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Pepperoni com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza";           // 意大利辣香肠披萨
		dough = "Crust";                    // 脆皮披萨
		sauce = "Marinara sauce";           // Marinara酱
		toppings.add("Sliced com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Pepperoni");   // 意大利辣香肠切片
		toppings.add("Sliced Onion");       // 洋葱切片
		toppings.add("Grated parmesan cheese");     // 磨碎的干奶酪粉
	}
}
