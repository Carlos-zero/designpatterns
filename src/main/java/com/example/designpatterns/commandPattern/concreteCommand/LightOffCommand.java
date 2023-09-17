package com.example.designpatterns.commandPattern.concreteCommand;

import com.example.designpatterns.commandPattern.Command;
import com.example.designpatterns.commandPattern.receiver.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
