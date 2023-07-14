package Multithreading.Synchronization.Deadlock;

public class SecondResource {
	public synchronized void method1(FirstResource fr) {
		System.out.println("Inside method 1 of SR");
		try {
			Thread.sleep(2000);	// main thread goes to sleep locking sr
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Invoking method 2 of FR");
		fr.method2();	// cant execute as fr is already locked by t
	}
	
	public synchronized void method2() {
		System.out.println("Inside method 2 of SR");
	}
}
