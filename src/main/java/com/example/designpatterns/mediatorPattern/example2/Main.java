package com.example.designpatterns.mediatorPattern.example2;

public class Main {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();

        USA usa = new USA(UNSC);
        Iraq iraq = new Iraq(UNSC);

        UNSC.setUsa(usa);
        UNSC.setIraq(iraq);

        usa.declare("不准研发核武器，否则要发动战争！");
        iraq.declare("我们没有核武器，也不怕侵略。");
    }
}