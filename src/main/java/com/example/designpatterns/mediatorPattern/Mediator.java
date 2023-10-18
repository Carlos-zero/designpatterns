package com.example.designpatterns.mediatorPattern;

/**
 * 抽象中介者类
 */
abstract class Mediator {
    public abstract void Send(String message, Colleague colleague);
}
