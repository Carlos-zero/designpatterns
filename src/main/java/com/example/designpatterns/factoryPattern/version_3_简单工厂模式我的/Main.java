package com.example.designpatterns.factoryPattern.version_3_简单工厂模式我的;

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


com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.CheesePizza prepare !
com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.CheesePizza bake !
com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.CheesePizza cut !
com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.CheesePizza box !


 */