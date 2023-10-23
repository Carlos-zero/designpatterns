package com.example.designpatterns.proxyPattern.version_1;

import java.rmi.Naming;

/**
 * 这就是监视器测试程序，CEO会执行此程序
 */
public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        // 被监视的位置有这些
        String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
                "rmi://boulder.mightygumball.com/gumballmachine",
                "rmi://austin.mightygumball.com/gumballmachine"};

        if (args.length >= 0) {
            location = new String[1];
            location[0] = "rmi://" + args[0] + "/gumballmachine";
        }

        GumballMonitor[] monitor = new GumballMonitor[location.length];


        for (int i = 0; i < location.length; i++) {
            try {
                // 为每个远程机器创建一个代理
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}
