package com.example.designpatterns.factoryPattern.version_5_工厂模式官方;

public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza() {
		name = "NY Style Veggie com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza";
		dough = "Thin Crust com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Dough";
		sauce = "Marinara com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Sauce";
 
		toppings.add("Grated Reggiano com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Cheese");
		toppings.add("Garlic");
		toppings.add("Onion");
		toppings.add("Mushrooms");
		toppings.add("Red Pepper");
	}
}