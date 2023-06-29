package Multithreading.ThreadObject;

import java.util.Scanner;

public class NewThread extends Thread { // object of this class can be called as thread object as it extends Thread class
    static int n, sum = 0;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread name : " + Thread.currentThread().getName());
        System.out.println("Sum of first 'N' numbers");
        Scanner sc = new Scanner(System.in);
        NewThread.n = sc.nextInt();
        sc.close();

        NewThread j = new NewThread();
        j.start();
        j.join();
        System.out.println("New thread name : " + j.getName() + " - j is new thread object");

        System.out.println("Sum: " + NewThread.sum);

    }

    public void run() { // joined thread
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= NewThread.n; i++) {
            NewThread.sum += i;
        }
    }
}
