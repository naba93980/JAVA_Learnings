package ConcurentCollection;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) throws InterruptedException {

        Map<String, Integer> coursesRating = new ConcurrentHashMap();
        coursesRating.put("Java", 1);
        coursesRating.put("Python", 2);
        coursesRating.put("AWS", 3);
        coursesRating.put("Docker", 4);


        // Failure-Safe Iterators: Iterators returned by ConcurrentHashMap are weakly consistent, 
        // meaning they will not throw ConcurrentModificationException even if the map is modified during iteration. 
        // However, they may or may not reflect the latest updates made to the map.

        Runnable r1 = () -> {
            coursesRating.put("Node", 5);
            System.out.println("Node added");
        };

        Runnable r2 = () -> {
            Iterator<String> iterator = coursesRating.keySet().iterator();
            while (iterator.hasNext()) {
                String course = iterator.next();
                System.out.println(course + " : " + coursesRating.get(course));
            }
        };

        new Thread(r2).start();
        new Thread(r1).start();

        Thread.sleep(1000);

        // The below code will print the updated map
        System.out.println(coursesRating);
    }
}
