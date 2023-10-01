package Multithreading.ServletFundas;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// demonstrate tomcat main class which creates a servlet instance, initializes it and then upon new connections a new thread calls the servlet service method
public class Tomcat {
    public static void main(String[] args) throws InterruptedException {

        TomcatServlet tomcatServlet = new TomcatServlet();
        tomcatServlet.init();

        ExecutorService service = Executors.newFixedThreadPool(4);

        // connection 1
        service.submit(new TomcatRunnable(tomcatServlet));

        // connection 2
        service.submit(new TomcatRunnable(tomcatServlet));

        // connection 3
        service.submit(new TomcatRunnable(tomcatServlet));

        // connection 4
        service.submit(new TomcatRunnable(tomcatServlet));

        service.shutdown();
  
    }
}
