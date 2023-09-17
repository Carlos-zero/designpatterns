package com.example.designpatterns.commandPattern;

/**
 * Command
 * 所有Command对象都需要实现该接口
 */
public interface Command {
    public void execute();

    public void undo();
}
