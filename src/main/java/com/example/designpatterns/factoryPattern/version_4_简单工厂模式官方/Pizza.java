package com.example.designpatterns.factoryPattern.version_4_简单工厂模式官方;

import java.util.*;

abstract public class Pizza {
    String name;
    String dough;           // 生面团
    String sauce;           // 酱汁
    List<String> toppings = new ArrayList<String>();        // 配菜

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }   // 准备

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
