package com.example.designpatterns.factoryPattern.version_3;

public class PepperoniPizza extends Pizza {

    public void prepare() {
        System.out.println("PepperoniPizza prepare !");
    }

    public void bake() {
        System.out.println("PepperoniPizza bake !");
    }

    public void cut() {
        System.out.println("PepperoniPizza cut !");
    }

    public void box() {
        System.out.println("PepperoniPizza box !");
    }
}
