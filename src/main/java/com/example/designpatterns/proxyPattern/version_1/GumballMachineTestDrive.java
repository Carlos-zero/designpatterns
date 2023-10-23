package com.example.designpatterns.proxyPattern.version_1;

import java.rmi.Naming;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        // 首先，我们需要在实例化糖果机器的代码周围加上 try/catch 。因为我们的构造器可能抛出异常。
        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            // 也添加上对 Naming，rebind 的调用，用 gumballmachine 的名字发布 GumballMachine 的 stub。
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
