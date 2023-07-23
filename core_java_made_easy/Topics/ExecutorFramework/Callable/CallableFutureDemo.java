package ExecutorFramework.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {
    public static void main(String[] args) {

        MyCallable[] callables = new MyCallable[]{new MyCallable(10),new MyCallable(20),new MyCallable(30),new MyCallable(40)};

        ExecutorService service = Executors.newFixedThreadPool(3);

        for (MyCallable myCallable : callables) {

            // Future is similar to Promise of javascript
            Future<Integer> futureResultPromise = service.submit(myCallable);          // similar to async code like readFile() (which delegates tasks to worker thread)  returning a promise in nodejs
            try {
                System.out.println(futureResultPromise.get());     // similar to await in javascript as it is blocking          // the caller thread need not be async returning promise like in node js, as each caller thread is for one single connection, while is nodejs the caller thread would hv been actually the one single main thread(event-loop) for all connections        // here caller threads waits for result when get() is called which otherwise in nodejs the result would have been received as arg. in callback which again would hv bn executed by main thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        service.shutdown();
    }
}

// https://stackoverflow.com/questions/14541975/whats-the-difference-between-a-future-and-a-promise#:~:text=Futures%20and%20promises%20are%20pretty,written%20(normally%20only%20once).
// https://stackoverflow.com/questions/49269162/java-future-asynchronous