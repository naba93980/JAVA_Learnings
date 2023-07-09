package Multithreading.ThreadGroup;

public class CustomThread extends Thread {
	
	public CustomThread(ThreadGroup group, String name) {
		super(group, name);
	}
	
	public CustomThread() {
		super();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(500);
			System.out.println("Hello from custom thread");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
