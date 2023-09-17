package com.example.designpatterns.commandPattern.client;

import com.example.designpatterns.commandPattern.concreteCommand.GarageDoorOpenCommand;
import com.example.designpatterns.commandPattern.concreteCommand.LightOnCommand;
import com.example.designpatterns.commandPattern.invoker.SimpleRemoteControl;
import com.example.designpatterns.commandPattern.receiver.GarageDoor;
import com.example.designpatterns.commandPattern.receiver.Light;

/**
 * Client
 * 这个是命令模式的客户
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        // 遥控器是命令的调用者，给遥控器一个命令，遥控器使用这个命令（怎么使用的对客户来说是个黑盒）。
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 创建了一个电灯对象，此对象就是请求（可以说成命令不？）的接收者。
        Light light = new Light("Living Room");
        // 这里创建一个命令，并确定该命令的接收者。
        LightOnCommand lightOn = new LightOnCommand(light);

        // 把命令传给调用者（向遥控器传达命令）。
        remote.setCommand(lightOn);
        // 模拟按下按钮，执行命令（对客户来说也是黑盒）
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
