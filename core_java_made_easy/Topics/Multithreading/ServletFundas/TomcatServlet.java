package Multithreading.ServletFundas;

// demonstrate servlet class
public class TomcatServlet {
    public void init() {
        System.out.println("init called ............");
    }

    public void service() {
        System.out.println("service called ............");
    }

    public void destroy() {
        System.out.println("destroy called ............");
    }
}
