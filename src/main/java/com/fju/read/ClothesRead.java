package com.fju.read;

import java.io.FileWriter;

public class ClothesRead {
    public static void main(String[] args) {
        try {
            // Constructs a FileWriter object given a file name.
            FileWriter fw = new FileWriter("衣服尺寸量法.txt");
            fw.write("This is one!");
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.println("Something Error");
        }

    }
}
