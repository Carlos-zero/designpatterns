package com.example.designpatterns.commandPattern.concreteCommand;

import com.example.designpatterns.commandPattern.Command;
import com.example.designpatterns.commandPattern.receiver.Light;

/**
 * ConcreteCommand
 * Command 接口的实现，
 * 该Command实现的持有的功能是LightOn
 */
public class LightOnCommand implements Command {
    // light 为该命令被执行时所操作的对象，换句话说，light是该命令的接收者
    Light light;

    // 构造器将会接收某个light对象，将其记录在实例变量中，作为当前Command的execute()方法的接收者。
    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * 这个execute()方法调用接收者对象的on()方法。
     */
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
