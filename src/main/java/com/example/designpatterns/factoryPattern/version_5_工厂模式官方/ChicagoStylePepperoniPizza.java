package com.example.designpatterns.factoryPattern.version_5_工厂模式官方;

public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza() {
		name = "Chicago Style com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Pepperoni com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza";
		dough = "Extra Thick Crust com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Dough";
		sauce = "Plum Tomato com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Sauce";
 
		toppings.add("Shredded Mozzarella com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Pepperoni");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
