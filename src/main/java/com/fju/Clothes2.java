package com.fju;

public class Clothes2 extends Clothes {

    public Clothes2() {
        length = 96;
        height = 84;
        width = 175;
    }

    @Override
    public String getName() {
        return "Clothes M";
    }

    @Override
    public int getPrice() {
        return 200;
    }
}
