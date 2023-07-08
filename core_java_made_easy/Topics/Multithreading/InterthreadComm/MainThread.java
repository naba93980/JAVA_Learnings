package Multithreading.InterthreadComm;

public class MainThread extends Thread {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        synchronized (t) {	
        	System.out.println("main thread going to wait");
        	t.wait();		// thread object is locked
        }
        System.out.println("main thread noified & reacivated");
        System.out.println(t.total);
    }
}
