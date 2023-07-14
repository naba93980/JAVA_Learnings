package Multithreading.Synchronization.Deadlock;

public class DeadLockDemo implements Runnable {

	public static FirstResource fr=new FirstResource();
	public static SecondResource sr=new SecondResource();

	@Override
	public void run() {
		fr.method1(DeadLockDemo.sr);	// t thread locks fr
	}
}
