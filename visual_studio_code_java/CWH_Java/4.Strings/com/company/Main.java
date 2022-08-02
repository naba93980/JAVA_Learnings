package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // String in java is class, not a primitive type
        // String is immutable in java, in javascript String and Number is immutable.
        // Strings are actually object
        // String literals are the same as string objects.
        // String literals are an instance of String class.

        // String objects stored in heap.
        String name = new String("Nabajyot Modak");

        /*
         * String literals are always stored in the string pool.
         * The reference to that string is returned
         */
        String name2 = "harry";

        System.out.println(name);
        System.out.println(name2);
        System.out.println("naba".length());

        Scanner obj = new Scanner(System.in);
        String a = obj.next();
        obj.nextLine();
        String b = obj.nextLine();
        System.out.println(a + b);
        obj.close();
    }
}

// https://www.javastring.net/java/string/java-string-literal
// https://www.javastring.net/java/string/java-string-intern-method-example

// in java primitives and string objects immutable
// in js primitives, strings objects and number objects are immutable

// in java, js arrays and objects are mutable