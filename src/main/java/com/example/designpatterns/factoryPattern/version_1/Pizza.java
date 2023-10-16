package com.example.designpatterns.factoryPattern.version_1;


public class Pizza {
    public Pizza() {
    }

    public void prepare() {
        System.out.println("com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza prepare !");
    }

    public void bake() {
        System.out.println("com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza bake !");
    }

    public void cut() {
        System.out.println("com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza cut !");
    }

    public void box() {
        System.out.println("com.example.designpatterns.factoryPattern.version_6_抽象工厂模式官方.Pizza.Pizza box !");
    }
}
