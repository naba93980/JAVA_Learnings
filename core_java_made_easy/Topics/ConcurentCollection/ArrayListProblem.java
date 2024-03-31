package ConcurentCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProblem {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("AWS");
        courses.add("Docker");

        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()) {

            // The below pieces of code will throw ConcurrentModificationException as we are trying to modify the list while iterating

            // System.out.println(iterator.next());
            // courses.add("Node");

            String course = iterator.next();
            System.out.println(course);
            if (course.equals("Docker")) {
                courses.remove(course);
            }            
        }
    }
}
