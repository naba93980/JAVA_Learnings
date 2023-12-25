package Java8Features.MethodReferencing;

public class MethodRefDemo {
    public static void myMethod(){
        for(int i=0; i<10; i++){
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args){

        Runnable r = MethodRefDemo:: myMethod;    // mapping myMethod to run of Runnable interface
        Thread t = new Thread(r);
        t.start();
    }
}
