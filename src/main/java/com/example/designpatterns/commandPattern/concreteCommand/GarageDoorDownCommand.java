package com.example.designpatterns.commandPattern.concreteCommand;

import com.example.designpatterns.commandPattern.Command;
import com.example.designpatterns.commandPattern.receiver.GarageDoor;

public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {

    }
}
