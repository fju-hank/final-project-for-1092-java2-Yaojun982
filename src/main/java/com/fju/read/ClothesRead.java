package com.fju.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ClothesRead {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("尺寸金額.txt");

            BufferedReader br = new BufferedReader(fr);
            String content = "";
            while (br.ready()) {
                content = br.readLine();
                System.out.println("Ready... read txt");
                System.out.println("-------------");
                System.out.println(content);
                System.out.println("-------------");
            }

            FileWriter fw = new FileWriter("target.txt");
            fw.write(content);
            fw.flush();
            System.out.println("success");
            fr.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("failure");
        }
    }
}