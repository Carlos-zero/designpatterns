package com.example.designpatterns.factoryPattern.version_4_简单工厂模式官方;

/**
 * 工厂模式，披萨商店
 */
public class PizzaStore {
	// 依赖于披萨工厂
	SimplePizzaFactory factory;
 
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza;

		// 通过披萨工厂构造目标披萨
		pizza = factory.createPizza(type);

		// 执行其方法生产披萨
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
