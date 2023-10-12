package com.example.designpatterns.factoryPattern.version_3;

/**
 * 当子类型有多种的情况下下，每当需要新增子类时，就需要修改【orderPizza】，违背了开闭原则
 */
public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("cheese");
    }
}

/*


CheesePizza prepare !
CheesePizza bake !
CheesePizza cut !
CheesePizza box !


 */