package com.example.designpatterns.commandPattern.invoker;

import com.example.designpatterns.commandPattern.Command;
import com.example.designpatterns.commandPattern.concreteCommand.NoCommand;

/**
 * Client
 * 拥有多个插槽的遥控器
 */
public class RemoteControl {

    // 有七个开关
    Command[] onCommands;
    Command[] offCommands;

    // 构造函数，初始化各个按钮的功能
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    // 为各个按钮设置命令对象
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    // 按下按钮时执行其设置的命令对象
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    // 覆盖 toString() ,打印出每个插槽和他对应的命令。
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n ------ Remote Control ------ \n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).
                    append("    ").append(offCommands[i].getClass().getName()).append(" \n");
        }
        return stringBuilder.toString();
    }
}
