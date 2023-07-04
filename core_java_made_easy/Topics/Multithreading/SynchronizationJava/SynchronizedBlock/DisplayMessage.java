package Multithreading.SynchronizationJava.SynchronizedBlock;

public class DisplayMessage {

    static int x=0;

    public void sayHello(String name) {
        System.out.println(this);
        synchronized (this) {                               // only one thread can access the block on same object at a time
            for (int i = 1; i <= 10; i++) {
                System.out.println("How are you " + name);
            }
        }
        synchronized (DisplayMessage.class){
            System.out.println((DisplayMessage.x)++);
        }
    }
}
