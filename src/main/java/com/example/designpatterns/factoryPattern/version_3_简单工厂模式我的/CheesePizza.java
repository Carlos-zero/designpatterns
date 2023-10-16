package com.example.designpatterns.factoryPattern.version_3_简单工厂模式我的;

public class CheesePizza extends Pizza {
    public void prepare() {
        System.out.println("com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.CheesePizza prepare !");
    }

    public void bake() {
        System.out.println("com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.CheesePizza bake !");
    }

    public void cut() {
        System.out.println("com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.CheesePizza cut !");
    }

    public void box() {
        System.out.println("com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.CheesePizza box !");
    }
}
