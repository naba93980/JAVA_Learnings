package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Bitwise operators:
        // System.out.println(3 | 4);

        // Bitshift operators:
        // System.out.println(4 >> 1); // 4 divided by 2^1
        // System.out.println(4 << 1); // 4 multiplied by 2*1

        // Type
        // byte a = 5;
        // float b = 6.54f;
        // float sum = a + b;

        // long a = 5;
        // double b = 6.54f;
        // double sum = a + b;

        // Type casting
        char newGrade = (char) ('a' + 7);
        System.out.println(newGrade);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a > 10);
        sc.close();
    }
}

// byte + short -> int
// int + short -> int
// long + float -> float
// int + float -> float
// char + int -> int
// char + short -> int
// long + double -> double
// float + double -> double