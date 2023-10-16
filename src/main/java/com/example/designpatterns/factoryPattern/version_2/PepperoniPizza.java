package com.example.designpatterns.factoryPattern.version_2;

public class PepperoniPizza extends Pizza{

    public void prepare() {
        System.out.println("com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.PepperoniPizza prepare !");
    }

    public void bake() {
        System.out.println("com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.PepperoniPizza bake !");
    }

    public void cut() {
        System.out.println("com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.PepperoniPizza cut !");
    }

    public void box() {
        System.out.println("com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.PepperoniPizza box !");
    }
}
