package com.example.designpatterns.MediatorPattern;

/**
 * 具体中介者
 */
public class ConcreteMediator extends Mediator {
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
        if (colleague == concreteColleague1) {
            concreteColleague1
        } else if (colleague == concreteColleague2) {

        }
    }
}
