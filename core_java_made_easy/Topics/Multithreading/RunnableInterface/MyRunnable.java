package Multithreading.RunnableInterface;

import java.util.Scanner;

public class MyRunnable implements Runnable {
    static int n,sum=0;

    @Override
     public void run() {       
        for (int i = 1; i <= MyRunnable.n; i++) {
            MyRunnable.sum += i;
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        };
    }

    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Sum of first 'N' numbers");
        Scanner sc = new Scanner(System.in);
        MyRunnable.n = sc.nextInt();
        sc.close();

        MyRunnable cp = new MyRunnable();

        Thread t1 = new Thread(cp);
        t1.start();
        t1.join();
        System.out.println("Sum: "+MyRunnable.sum);
    }
}
