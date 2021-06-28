package com.fju.read;

import java.io.FileWriter;

public class Sizemoney {
    public static void main(String[] args) {
        try {
// Constructs a FileWriter object given a file name.
            FileWriter fw = new FileWriter("尺寸金額.txt");
            fw.write("This is one!");
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.println("Something Error");
        }
    }
}