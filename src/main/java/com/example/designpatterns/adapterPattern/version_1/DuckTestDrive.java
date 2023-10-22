package com.example.designpatterns.adapterPattern.version_1;

public class DuckTestDrive {
    public static void main(String[] args) {
        // 先创建一只鸭子和一只火鸡
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        // 然后将火鸡包装进一个火鸡适配器中，使它看起来像是一只鸭子
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        // 接着测试这只火鸡，让它咯咯叫，让它飞行
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        // 接着测试这只鸭子
        System.out.println("\nThe Duck says...");
        testDuck(duck);

        // 接着试着让我们适配的火鸡作为鸭子被测试
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        // Challenge
//        Drone drone = new SuperDrone();
//        Duck droneAdapter = new DroneAdapter(drone);
//        testDuck(droneAdapter);
    }

    // 测试鸭子的行为
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}