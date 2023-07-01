package Multithreading.Interrupt;

public class InterruptDemo {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        Thread IntDemo = new Thread(t);
        IntDemo.start();
        System.out.println("Thread started");
        IntDemo.interrupt();
        System.out.println("Thread interrupted");
        System.out.println("end of main thread");
    }
}
