package com.fju;

public abstract class  Clothes extends SizeApp {
    int length;
    int width;
    int height;

    public boolean validate(int a, int b, int c) {
        return (a <= length && b <= width && c <= height);
    }

    public abstract String getName();

    public abstract int getPrice();
}
