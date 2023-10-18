package com.example.designpatterns.mediatorPattern;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    // 发送给中介者的消息
    public void Send(String message) {
        // 发送信息时通常是中介者发送出去的
        mediator.Send(message, this);
    }

    // 
    public void Notify(String message) {
        System.out.println("Colleague1 received：" + message);
    }
}
