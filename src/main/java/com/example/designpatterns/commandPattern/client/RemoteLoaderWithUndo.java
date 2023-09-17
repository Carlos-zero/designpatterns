package com.example.designpatterns.commandPattern.client;

import com.example.designpatterns.commandPattern.concreteCommand.*;
import com.example.designpatterns.commandPattern.invoker.RemoteControlWithUndo;
import com.example.designpatterns.commandPattern.receiver.CeilingFan;
import com.example.designpatterns.commandPattern.receiver.Light;

public class RemoteLoaderWithUndo {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        Light light = new Light("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(light);
        LightOffCommand livingRoomLightOff = new LightOffCommand(light);

        remoteControlWithUndo.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.onButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();


        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControlWithUndo.setCommand(1, ceilingFanMedium, ceilingFanOff);
        remoteControlWithUndo.setCommand(2, ceilingFanHigh, ceilingFanOff);

        remoteControlWithUndo.onButtonWasPushed(1);
        remoteControlWithUndo.offButtonWasPushed(1);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();

        remoteControlWithUndo.onButtonWasPushed(2);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();

    }
}
