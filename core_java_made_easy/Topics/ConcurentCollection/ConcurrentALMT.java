package ConcurentCollection;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class ConcurrentALMT {
    public static void main(String[] args) throws InterruptedException {

        CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("AWS");
        courses.add("Docker");

        //  Both the threads are accessing the copied list simultaneously

        Runnable r1 = () -> {
            System.out.println("Node added");
            courses.add("Node");
        };

        Runnable r2 = () -> {

            // Iterate over the list
            Iterator<String> iterator = courses.iterator();
            while (iterator.hasNext()) {
                String course = iterator.next();
                System.out.println(course);
            }
        };

        new Thread(r2).start();
        new Thread(r1).start();

        Thread.sleep(2000);

        // The below code will print the updated list

        System.out.println(courses);
    }
}
