package com.fju;

import java.util.Scanner;



public class Tester extends SizeApp {
    public static void main(String[] args) {
        Clothes[] clothes = {new Clothes1(), new Clothes2(),
                new Clothes3(), new Clothes4()};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object\'s bust: ");
        int length = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s waist: ");
        int width = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s height: ");
        int height = Integer.parseInt(scanner.next());
        System.out.println("Length: " + length + ", width: " + width + ", height: " + height);
        for (Clothes box : clothes) {
            if (box.validate(length, width, height)) {
                System.out.println(box.getName() + " / " + box.getPrice());
                break;
            }
        }
        if (length <= 88 && width <= 76 && height <= 165) {
            System.out.println("Clothes S it is, price: 100");      //1
        } else if (length <= 96 && width <= 84 && height <= 175) {
            System.out.println("Clothes M it is, price: 200");               //2
        }else if (length <= 104 && width <= 94 && height <= 175) {
            System.out.println("Clothes L it is, price: 300");            //3
    }else if (length <= 112 && width <= 104 && height <= 185) {
            System.out.println("Clothes XL it is, price: 1000");           //4
        }
    }
}

