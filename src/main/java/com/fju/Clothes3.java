package com.fju;

public class Clothes3 extends Clothes{
    public Clothes3() {
        length = 104;
        width = 94;
        height = 175;
    }
    @Override
    public String getName() {
        return "Clothes L";
    }

    @Override
    public int getPrice() {
        return 300;
    }
}
