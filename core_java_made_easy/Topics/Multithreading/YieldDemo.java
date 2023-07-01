package Multithreading;

import java.util.Scanner;

public class YieldDemo implements Runnable {
    static int n, sum = 0;

    @Override
    public void run() {

        Thread.yield();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("child method");
        }
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sum of first 'N' numbers");
        Scanner sc = new Scanner(System.in);
        YieldDemo.n = sc.nextInt();
        sc.close();

        YieldDemo cp = new YieldDemo();
        System.out.println(cp.getClass().getName());

        Thread t1 = new Thread(cp);
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main method");
        }

    }
}
