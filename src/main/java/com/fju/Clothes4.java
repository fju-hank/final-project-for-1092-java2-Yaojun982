package com.fju;

public class Clothes4 extends Clothes{
    public Clothes4() {
        length = 112;
        width = 104;
        height = 185;
    }

    @Override
    public String getName() {
        return "Clothes XL";
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}

