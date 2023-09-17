package com.example.designpatterns.commandPattern.receiver;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;


    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void on() {
        System.out.println(location + "'s CeilingFan is on;");
    }

    public void off() {
        System.out.println(location + "'s CeilingFan is off;");
        speed = OFF;
    }

    public void high() {
        System.out.println(location + "'s CeilingFan is on high;");
        speed = HIGH;
    }

    public void medium() {
        System.out.println(location + "'s CeilingFan is on medium;");
        speed = MEDIUM;
    }

    public void low() {
        System.out.println(location + "'s CeilingFan is on low;");
        speed = LOW;
    }

    public int getSpeed() {
//        System.out.println(location + "'s CeilingFan speed is " + speed + ";");
        return speed;
    }
}
