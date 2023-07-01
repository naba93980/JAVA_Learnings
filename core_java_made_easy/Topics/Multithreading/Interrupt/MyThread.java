package Multithreading.Interrupt;

public class MyThread implements Runnable {
    public void run() {

        // try {
        //     for (int i = 0; i < 10; i++) {
        //         System.out.println("Lazy Thread");
        //         Thread.sleep(2000);
        //     }
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // } finally {
        //     System.out.println("byeeee");
        // }

        try {
            for (int i = 0; i < 100; i++) {
                if (!Thread.interrupted()) {
                    System.out.println(i);
                } else {
                    throw new InterruptedException();
                }
            }
        } catch (Exception e) {
            System.out.println("error caught");
            e.printStackTrace();
        }
    }
}
