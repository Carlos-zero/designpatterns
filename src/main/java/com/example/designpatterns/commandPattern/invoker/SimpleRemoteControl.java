package com.example.designpatterns.commandPattern.invoker;

import com.example.designpatterns.commandPattern.Command;

/**
 * Invoker
 * 具体命令的使用者
 * 这是一个类比于遥控器的控制类
 */
public class SimpleRemoteControl {
    // 遥控器的一个插槽应该持有一个命令，而这个命令有着自己独特的功能，也即控制着一个装置。
    Command slot;

    public SimpleRemoteControl(){}

    // 为这个插槽设置一个命令。
    // 如果这段代码的客户想要改变遥控器的这个按钮的行为，可以多次调用这个方法，分别传入不同的command来进行修改。
    public void setCommand(Command command) {
        slot = command;
    }

    // 当按下按钮时，调用当前设置的命令对象的execute()方法，执行该命令对应的功能。
    public void buttonWasPressed() {
        slot.execute();
    }
}
