package InnerClass.AnonymousClasses;

public class AnonymousRunnable {
	public static void main(String[] args) {
		Thread t=new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Annonymous runnable implementation");
			}
			
		});
		t.start();
	}
}
