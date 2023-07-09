package Multithreading.ThreadGroup;

public class CustomThreadMain {
	public static void main(String[] args) throws InterruptedException {
		
		// create thread group
		ThreadGroup threadGroup = new ThreadGroup("custom_thread_group_1");
		// threadGroup.setMaxPriority(3);
		
		// assigning custom thread to a thread group
		CustomThread customThread = new CustomThread(threadGroup, "ct1");
		customThread.start();
		System.out.println("group name of custom thread : "+customThread.getThreadGroup().getName());
		System.out.println("parent group name of custom thread : "+customThread.getThreadGroup().getParent().getName());
		
		// list info about all the thread present in this group
		System.out.println("current threads active: "+threadGroup.activeCount());
		threadGroup.list();	
		
		CustomThread customThread2 = new CustomThread();
		System.out.println("group name of custom thread 2 : "+customThread2.getThreadGroup().getName());
		
		System.out.println("pause from main thread");
		
		Thread.sleep(3000);
		
		System.out.println("current threads active: "+threadGroup.activeCount());
		threadGroup.list();
		
	}
}
