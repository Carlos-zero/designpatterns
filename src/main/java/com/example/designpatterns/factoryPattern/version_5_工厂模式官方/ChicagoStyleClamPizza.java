package com.example.designpatterns.factoryPattern.version_5_工厂模式官方;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		name = "Chicago Style Clam com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza";
		dough = "Extra Thick Crust com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Dough";
		sauce = "Plum Tomato com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Sauce";
 
		toppings.add("Shredded Mozzarella com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Cheese");
		toppings.add("Frozen com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Clams from Chesapeake Bay");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
