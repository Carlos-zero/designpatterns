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


com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza prepare !
com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza bake !
com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza cut !
com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza box !


 */