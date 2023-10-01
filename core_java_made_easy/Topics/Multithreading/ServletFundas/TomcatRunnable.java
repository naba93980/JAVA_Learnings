package Multithreading.ServletFundas;

// this class is to show how can differernt thread calls the service() on the only servlet instance
public class TomcatRunnable implements Runnable {

    TomcatServlet servlet;

    TomcatRunnable(TomcatServlet servlet) {
        this.servlet = servlet;
    }

    @Override
    public void run() {
        servlet.service();
    }
}
