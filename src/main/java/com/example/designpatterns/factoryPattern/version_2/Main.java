package com.example.designpatterns.factoryPattern.version_2;

/**
 * 当子类型有多种的情况下下，每当需要新增子类时，就需要修改【orderPizza】，违背了开闭原则
 */
public class Main {
    public static void main(String[] args) {
        Pizza pizza = orderPizza("cheese");
    }

    static Pizza orderPizza(String type) {
        Pizza pizza;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else {
            pizza = new Pizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}


/*


CheesePizza prepare !
CheesePizza bake !
CheesePizza cut !
CheesePizza box !


 */
