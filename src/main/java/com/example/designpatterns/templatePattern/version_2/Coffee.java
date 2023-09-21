package com.example.designpatterns.templatePattern.version_2;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("用沸水侵泡茶叶！！！");
    }

    @Override
    void addCondiments() {
        System.out.println("加柠檬！！！");
    }
}
