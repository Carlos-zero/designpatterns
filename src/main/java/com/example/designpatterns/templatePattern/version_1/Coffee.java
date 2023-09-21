package com.example.designpatterns.templatePattern.version_1;

public class Coffee {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater() {
        System.out.println("烧开水!!!");
    }

    public void brewCoffeeGrinds() {
        System.out.println("用沸水冲泡咖啡！！！");
    }

    public void pourInCup() {
        System.out.println("把咖啡倒进杯子！！！");
    }

    public void addSugarAndMilk() {
        System.out.println("加糖和牛奶！！！");
    }
}
