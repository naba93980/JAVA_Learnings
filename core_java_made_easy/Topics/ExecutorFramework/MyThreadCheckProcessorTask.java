package ExecutorFramework;

// Class to represent Runnable task
public class MyThreadCheckProcessorTask implements Runnable {

    String name;

    public MyThreadCheckProcessorTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " - check processor task has begun checking process : "
                + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name + " - check processor has completed processing the check : "
                + Thread.currentThread().getName());
    }

}
