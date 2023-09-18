package com.example.designpatterns.strategyPattern.version_1;


/**
 * 最基础的需求。【叫声】、【泳姿】均由父类写死。【外观】则定义为抽象方法，交由子类实现， 所以运行结果中。除了【外观均相同】。
 */
public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        ReadDuck readDuck = new ReadDuck();
    }
}

/*
    ------------------------------------
    外观->绿头鸭！
    叫声->呱呱！
    泳姿->水上漂！
    ------------------------------------
    ------------------------------------
    外观->红头鸭！
    叫声->呱呱！
    泳姿->水上漂！
    ------------------------------------
 */