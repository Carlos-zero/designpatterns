package com.example.designpatterns.MediatorPattern;

import java.io.Console;
import java.util.StringTokenizer;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void Send(String message) {
        // 发送信息时通常是中介者发送出去的
        mediator.Send(message, this);
    }

    public void Notify(String message) {
        System.out.println("Received_1：" + message);
    }
}
