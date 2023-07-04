package Multithreading.SynchronizationJava.ClassLevelLock;

public class MyThread extends Thread {

    String name;
    
    MyThread(String name){
        this.name=name;
    }

    public void run(){
        DisplayMessage.sayHello(this.name);
    }
}
