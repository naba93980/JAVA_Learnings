package Multithreading.InterthreadComm;

public class MyThread extends Thread {

    int total;

    @Override
    public void run() {				// similar to public synchronized void run()
        synchronized (this) {     // here the thread object is locking itself
            System.out.println("child thread is calculating the sum");
            for (int i = 0; i < 100; i++) {
                this.total += i;
            }
            this.notify();
        }
    }
}
 