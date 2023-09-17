package com.example.designpatterns.commandPattern.concreteCommand;

import com.example.designpatterns.commandPattern.Command;

/**
 * 空Command
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
