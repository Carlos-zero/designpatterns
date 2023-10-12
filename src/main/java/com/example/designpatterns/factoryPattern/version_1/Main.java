package com.example.designpatterns.factoryPattern.version_1;

/**
 * 最基础的类型，实例化时也是直接实例化
 */
public class Main {
    public static void main(String[] args) {
        Pizza pizza = orderPizza();
    }

    static Pizza orderPizza() {
        Pizza pizza = new Pizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

/*


Pizza prepare !
Pizza bake !
Pizza cut !
Pizza box !


 */