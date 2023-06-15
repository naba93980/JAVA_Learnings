package Multithreading;

public class Sleep extends Thread{
    public static void main(String[] args) throws InterruptedException {

        Sleep mt=new Sleep();
        mt.start();

          for(int x=1;x<=20;x++){
            System.out.println("x: "+x+"   ");
            Thread.sleep(500);  // thread in which block is called goes into sleep for the specified ms
        }
    }

    public void run(){
        for(int i=1;i<=20;i++){
            System.out.println("i: "+i+"   ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Time for child thread to  exit");
            }
        }
    }
}
