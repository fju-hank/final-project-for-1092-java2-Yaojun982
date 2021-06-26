package com.fju;

public class Clothes1 extends Clothes {

    public Clothes1() {
        length = 88;
        height = 76;
        width = 165;
    }

    @Override
    public String getName() {
        return "Clothes S";
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
