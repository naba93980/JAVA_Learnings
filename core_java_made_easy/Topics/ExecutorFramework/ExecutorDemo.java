package ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {

        // array of Runnable objects
        MyThreadCheckProcessorTask[] cptasks = { new MyThreadCheckProcessorTask("ATM"),
                new MyThreadCheckProcessorTask("Bank"), new MyThreadCheckProcessorTask("Mobile"),
                new MyThreadCheckProcessorTask("Web") };


        // creating pool of threads
        ExecutorService service = Executors.newFixedThreadPool(4);

        // submitting tasks for execution by threads in the pool
        for (MyThreadCheckProcessorTask task : cptasks) {
            service.submit(task);
        }
        service.shutdown();

    }
}
