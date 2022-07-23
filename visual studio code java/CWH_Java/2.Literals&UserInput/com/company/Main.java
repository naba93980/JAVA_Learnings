package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // char aChar = 'a';

        // byte ageByte = 127;
        // short ageShort = 345;
        // int ageInt = 23654;
        // long ageLong = 2222222222222l; // by default 2222222222 is integer

        // float aFloat = 5.6F; // by default 5.6 is double
        // double dDouble = 6.89;

        System.out.println("Taking Input from User");
        Scanner sc = new Scanner(System.in); // System.in represent variable of type InputStream class and means
                                             // accepting input from standard input such as keyboard.
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum = " + sum);

        sc.nextLine(); // consumes "\n";

        boolean b1 = sc.hasNextInt(); // take integer input and check if the thing taken as input is integer or not.
        System.out.println(b1);

        System.out.println(sc.nextLine()); // consumes the integer of line 27
        String str2 = sc.nextLine(); // nextline() finishes reading once it encounters "\n"
        System.out.println(str2);

        String name = sc.next(); // next() finishes reading once it encounters " ".
        System.out.println(name);
        sc.close();

    }
}
