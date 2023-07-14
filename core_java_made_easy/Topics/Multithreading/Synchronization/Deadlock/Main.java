package Multithreading.Synchronization.Deadlock;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new DeadLockDemo());
        t.start();
        DeadLockDemo.sr.method1(DeadLockDemo.fr);   // main thread locks sr
    }
}
