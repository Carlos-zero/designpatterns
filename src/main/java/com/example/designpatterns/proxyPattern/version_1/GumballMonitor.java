package com.example.designpatterns.proxyPattern.version_1;

import java.rmi.RemoteException;

/**
 * 这是监控类，它持有一个 GumballMachineRemote 的引用，并且提供了报告生成的方法。
 */
public class GumballMonitor {
    // 准备依赖此远程接口，而不是具体的 GumballMachine 类
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount() + " gumballs");
            System.out.println("Current state: " + machine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}