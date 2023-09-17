package com.example.designpatterns.commandPattern.receiver;

/**
 * Receiver
 */
public class Light {
    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + "‘s Light is on!");
    }

    public void off() {
        System.out.println(location + "'s Light is off!");
    }
}
