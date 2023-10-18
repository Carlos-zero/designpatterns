package com.example.designpatterns.mediatorPattern.example1;

/**
 * 具体中介者
 */
public class ConcreteMediator extends Mediator {
    // 对象
    private Colleague concreteColleague1;
    private Colleague concreteColleague2;

    public void setConcreteColleague1(Colleague concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(Colleague concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    @Override
    public void Send(String message, Colleague colleague) {
        if (colleague instanceof ConcreteColleague1) {
            concreteColleague2.Notify(message);
        } else if (colleague instanceof ConcreteColleague2) {
            concreteColleague1.Notify(message);
        }
    }
}
