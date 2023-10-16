package com.example.designpatterns.factoryPattern.version_5_工厂模式官方;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		name = "Chicago Deep Dish Veggie com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza";
		dough = "Extra Thick Crust com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Dough";
		sauce = "Plum Tomato com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Sauce";
 
		toppings.add("Shredded Mozzarella com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Ingredient.I.Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
