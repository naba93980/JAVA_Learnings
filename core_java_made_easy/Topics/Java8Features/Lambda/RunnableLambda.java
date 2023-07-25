package Java8Features.Lambda;

public class RunnableLambda {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Child Thread");
            }
        };

        Thread t = new Thread(r);
        t.start();
        t.join();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
