package Multithreading;

public class MultiThreaded extends Thread{
    public static void main(String[] args) {

        MultiThreaded mt=new MultiThreaded();
        mt.start(); // starts new thread

          for(int x=1;x<=20;x++){
            System.out.println("x: "+x+"   ");
        }
    }

    public void run(){
        for(int i=1;i<=20;i++){
            System.out.println("i: "+i+"   ");
        }
    }
}

// stack 1 main thread : main() -> Multithreaded() -> start()  ------> stack 2child thread : run() 