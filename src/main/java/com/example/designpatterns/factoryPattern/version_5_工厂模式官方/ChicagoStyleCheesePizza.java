package com.example.designpatterns.factoryPattern.version_5_工厂模式官方;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() { 
		name = "Chicago Style Deep Dish com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Cheese com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza";
		dough = "Extra Thick Crust com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Dough";
		sauce = "Plum Tomato com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Sauce";
 
		toppings.add("Shredded Mozzarella com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Cheese");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
