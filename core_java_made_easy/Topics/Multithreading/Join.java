package Multithreading;

import java.util.Scanner;

public class Join extends Thread {
    static int n, sum = 0;

    public static void main(String[] args) {
        System.out.println("Sum of first 'N' numbers");
        Scanner sc = new Scanner(System.in);
        Join.n = sc.nextInt();
        sc.close();

        Join j=new Join();
        long startTime = System.currentTimeMillis();
        j.start();

        try {
            j.join();                                          // blocks current main thread, joined thread will be executed first then main thread will continue
        } catch (InterruptedException e) {    // thread in waiting/block state can throw exception once it receives interrupt signal
            e.printStackTrace();
        }

        System.out.println("Sum: "+Join.sum);
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }

    public void run() {             // joined thread
        for (int i = 1; i <= Join.n; i++) {
            Join.sum += i;
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        };
    }
}
