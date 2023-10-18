package com.example.designpatterns.mediatorPattern.example1;

/**
 * 抽象中介者类
 */
abstract class Mediator {
    public abstract void Send(String message, Colleague colleague);
}
