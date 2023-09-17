package com.example.designpatterns.commandPattern.client;

import com.example.designpatterns.commandPattern.concreteCommand.*;
import com.example.designpatterns.commandPattern.invoker.RemoteControl;
import com.example.designpatterns.commandPattern.receiver.CeilingFan;
import com.example.designpatterns.commandPattern.receiver.GarageDoor;
import com.example.designpatterns.commandPattern.receiver.Light;
import com.example.designpatterns.commandPattern.receiver.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        // 实例化Invoker
        RemoteControl remoteControl = new RemoteControl();

        // 实例化Receiver
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("House");
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("kitchen");
        Stereo stereo = new Stereo("Living Room");

        // 传入Receiver实例化ConcreteCommand
        CeilingFanOnCommand LivingRoomCeilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand LivingRoomCeilingFanOff = new CeilingFanOffCommand(ceilingFan);
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        LightOnCommand LivingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand LivingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        // 使用Invoker设置ConcreteCommand
        remoteControl.setCommand(0, LivingRoomCeilingFanOn, LivingRoomCeilingFanOff);
        remoteControl.setCommand(1, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(2, LivingRoomLightOn, LivingRoomLightOff);
        remoteControl.setCommand(3, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        // 使用Invoker执行具体操作
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
    }
}
