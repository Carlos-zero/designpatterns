package com.example.designpatterns.factoryPattern.version_3_简单工厂模式我的;

public class Pizza {
    public Pizza() {
    }

    public void prepare() {
        System.out.println("prepare !");
    }

    public void bake() {
        System.out.println("bake !");
    }

    public void cut() {
        System.out.println("cut !");
    }

    public void box() {
        System.out.println("box !");
    }
}
