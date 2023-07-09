package Multithreading.ThreadGroup;

public class ThreadGroupDemo {
	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(9);
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

		ThreadGroup baap = new ThreadGroup("Baap");
		ThreadGroup beta = new ThreadGroup(baap, "Beta");
		System.out.println(beta);
		System.out.println(beta.getParent());
		System.out.println(beta.getParent().getParent());

		beta.setMaxPriority(8);

		Thread thread1 = new Thread(beta, "thread1");
		Thread thread2 = new Thread(beta, "thread2");
		System.out.println(thread1.getThreadGroup());
		System.out.println(thread1.getThreadGroup().getParent());
		System.out.println(thread2.getPriority());
	}
}

//  Newly created threads inherit the priority of their parent thread or thread group unless explicitly specified.
//  If thread group maxPriority is less than that of parent thread priority, then threads takes priority of its group, otherwise takes priority of the parent thread
