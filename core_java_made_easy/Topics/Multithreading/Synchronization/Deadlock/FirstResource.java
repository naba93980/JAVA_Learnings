package Multithreading.Synchronization.Deadlock;

public class FirstResource {
	
	public synchronized void method1(SecondResource sr) {
		System.out.println("Inside method 1 of FR");
		try {
			Thread.sleep(2000);	// t thread goes to sleep locking fr
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Invoking method 2 of SR");
		sr.method2();				// t thread locks sr as method2 is synchronized
	}
	
	public synchronized void method2() {
		System.out.println("Inside method 2 of FR");
	}
}
