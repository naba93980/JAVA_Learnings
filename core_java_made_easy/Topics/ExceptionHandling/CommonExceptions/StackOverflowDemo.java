package ExceptionHandling.CommonExceptions;

public class StackOverflowDemo {
    void f1(){
        f2();
    }
    void f2(){
        f1();
    }
    public static void main(String[] args) {
        StackOverflowDemo c=new StackOverflowDemo();
        c.f1();
    }
}
