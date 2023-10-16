package com.example.designpatterns.factoryPattern.version_5_工厂模式官方;

public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza() {
		name = "NY Style Clam com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza";
		dough = "Thin Crust com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Dough";
		sauce = "Marinara com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Sauce";
 
		toppings.add("Grated Reggiano com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Cheese");
		toppings.add("Fresh com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Clams from Long Island Sound");
	}
}
