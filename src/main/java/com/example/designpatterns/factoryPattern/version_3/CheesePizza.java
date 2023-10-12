package com.example.designpatterns.factoryPattern.version_3;

public class CheesePizza extends Pizza {
    public void prepare() {
        System.out.println("CheesePizza prepare !");
    }

    public void bake() {
        System.out.println("CheesePizza bake !");
    }

    public void cut() {
        System.out.println("CheesePizza cut !");
    }

    public void box() {
        System.out.println("CheesePizza box !");
    }
}
