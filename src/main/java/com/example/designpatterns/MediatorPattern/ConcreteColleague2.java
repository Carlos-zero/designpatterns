package com.example.designpatterns.MediatorPattern;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void Send(String message) {
        // 发送信息时通常是中介者发送出去的
        mediator.Send(message, this);
    }

    public void Notify(String message) {
        System.out.println("Received_2：" + message);
    }
}
