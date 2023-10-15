package com.example.designpatterns.factoryPattern.version_4_简单工厂模式官方;

/**
 * 简单工厂
 */
public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		// 简单披萨工厂，根据不同的入参生成不同的披萨
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
