package com.example.designpatterns.factoryPattern.version_2;

public class GreekPizza extends Pizza {
    public void prepare() {
        System.out.println("GreekPizza prepare !");
    }

    public void bake() {
        System.out.println("GreekPizza bake !");
    }

    public void cut() {
        System.out.println("GreekPizza cut !");
    }

    public void box() {
        System.out.println("GreekPizza box !");
    }
}
