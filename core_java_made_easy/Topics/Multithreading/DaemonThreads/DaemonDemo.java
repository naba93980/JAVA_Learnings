package Multithreading.DaemonThreads;

public class DaemonDemo {
	public static void main(String[] args) {
		
		// check if current thread is daemon thread
		System.out.println(Thread.currentThread().isDaemon());
		
		MyThread myThread = new MyThread();
		myThread.setDaemon(true);		// if u write this after myThread.start(), it will throw exception
		System.out.println(myThread.isDaemon());
		myThread.start();
	}
}
