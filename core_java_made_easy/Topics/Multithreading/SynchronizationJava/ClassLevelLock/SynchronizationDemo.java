package Multithreading.SynchronizationJava.ClassLevelLock;

public class SynchronizationDemo {
    public static void main(String[] args) {

        MyThread t1=new MyThread("Naba");
        MyThread t2=new MyThread("Modak");
        t1.start();
        t2.start();
    }
}
