package com.example.designpatterns.factoryPattern.version_4_简单工厂模式官方;

/**
 * 当子类型有多种的情况下下，每当需要新增子类时，就需要修改【orderPizza】，违背了开闭原则
 */
public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}

