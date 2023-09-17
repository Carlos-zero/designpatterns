package com.example.designpatterns.commandPattern.concreteCommand;

import com.example.designpatterns.commandPattern.Command;
import com.example.designpatterns.commandPattern.receiver.GarageDoor;

public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {

    }
}
