package com.example.designpatterns.commandPattern.receiver;

/**
 * Receiver
 */
public class GarageDoor {
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void open() {
        System.out.println(location + "'s GarageDoor is open;");
    }

    public void up() {
        System.out.println(location + "'s GarageDoor is up;");
    }

    public void down() {
        System.out.println(location + "'s GarageDoor is down;");
    }
}
