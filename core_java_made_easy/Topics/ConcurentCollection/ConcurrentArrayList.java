package ConcurentCollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentArrayList {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("AWS");
        courses.add("Docker");

        Iterator<String> iterator = courses.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            courses.add("Node");
        }

        // Here new Iterator gets the updated list
        Iterator<String> iterator2 = courses.iterator();

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}

// this works when there is lot of read operations and less write operations