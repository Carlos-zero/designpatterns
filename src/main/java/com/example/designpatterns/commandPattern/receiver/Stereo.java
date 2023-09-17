package com.example.designpatterns.commandPattern.receiver;

public class Stereo {
    String location;

    int volume;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + "'s Stereo is on;");
    }

    public void off() {
        System.out.println(location + "'s Stereo is off;");
    }

    public void setCD() {
        System.out.println(location + "'s Stereo set CD;");
    }

    public void setDVD() {
        System.out.println(location + "'s Stereo set DVD;");
    }

    public void setRadio() {
        System.out.println(location + "'s Stereo set Radio;");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(location + "'s Stereo set volume " + volume + ";");
    }
}
