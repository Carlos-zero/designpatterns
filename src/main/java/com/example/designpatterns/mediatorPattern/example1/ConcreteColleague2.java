package com.example.designpatterns.mediatorPattern.example1;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void Send(String message) {
        System.out.println("Colleague2 向中介者发送消息");
        // 发送信息时通常是中介者发送出去的
        mediator.Send(message, this);
    }

    public void Notify(String message) {
        System.out.println("Colleague2 received：" + message);
    }
}
