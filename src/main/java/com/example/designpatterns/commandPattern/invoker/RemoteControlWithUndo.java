package com.example.designpatterns.commandPattern.invoker;

import com.example.designpatterns.commandPattern.Command;
import com.example.designpatterns.commandPattern.concreteCommand.NoCommand;

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    // 前一个命令将会被记录在这里
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        // 一开始并没有所谓的"前一个命令"，所以将他设置成NoCommand的对象
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        // 当按下按钮，我们取得这个命令，并优先执行它，然后将它记录在undoCommand实例变量中，不管是”开“或”关“命令，我们的处理方法是一样的
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    // 当按下撤销按钮，我们调用 undoCommand 实例变量的undo()方法，就可以倒转前一个命令
    public void undoButtonWasPushed(){
        undoCommand.undo();;
    }

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
