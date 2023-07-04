package Multithreading.SynchronizationJava.SynchronizedBlock;

public class SynchronizationDemo {
    public static void main(String[] args) {

        DisplayMessage dm=new DisplayMessage();
        MyThread t1=new MyThread(dm, "Naba");
        MyThread t2=new MyThread(dm, "Modak");
        t1.start();
        t2.start();
    }
}
