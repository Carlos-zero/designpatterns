package com.example.designpatterns.strategyPattern.version_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("------------------------------------");
    }
}
