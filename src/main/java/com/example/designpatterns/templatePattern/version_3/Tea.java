package com.example.designpatterns.templatePattern.version_3;

public class Tea extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("用沸水冲泡咖啡！！！");
    }

    @Override
    void addCondiments() {
        System.out.println("加糖和牛奶！！！");
    }
}
