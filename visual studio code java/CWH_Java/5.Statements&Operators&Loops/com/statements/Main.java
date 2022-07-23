package com.statements;

import java.util.Scanner;

class Switch {
    int x;

    public void runSwitch() {
        switch (x) {
            case 1: {
                System.out.println(x);
                System.out.println(x + 5);
                break;
            }
            default: {
                System.out.println("does not exist");
            }
        }
    }

    public void runEnhancedSwitch() {
        switch (x) {
            case 1 -> {
                System.out.println(x);
                System.out.println(x + 5);
            }
            default ->
                System.out.println("does not exist");
        }
    }

    Switch(int x) {
        this.x = x;
    }
};

public class Main {
    public static void main(String[] args) {
        // conditionals
        int a;
        System.out.println("Enter a\n");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        sc.close();
        if (a > 10)
            System.out.println("nice");
        else
            System.out.println("bad");

        Switch obj = new Switch(1);
        obj.runSwitch();
        obj.runEnhancedSwitch();
    }
}
