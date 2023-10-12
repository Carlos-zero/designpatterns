package com.example.designpatterns.templatePattern.version_3;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("用沸水侵泡茶叶！！！");
    }

    @Override
    void addCondiments() {
        System.out.println("加柠檬！！！");
    }
}
