package CollectionFramework.List.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args) {

        Object[] objects = new Object[10000000];  // create an array of objects

        for(int i=0;i<objects.length;i++){
            objects[i]=new Object();                      // assigining values in array
        }

        List<Object> list = new LinkedList<>();     // slower than ArrayList<>() as objects are created in heap randomly

        long start=System.currentTimeMillis();
        for (Object object : objects) {
            list.add(object);                                   // adding all values in array to the list
            // System.out.println(object);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);

        long start2=System.currentTimeMillis();
        System.out.println(list.get(6000000));  // O(N)
        long end2=System.currentTimeMillis();
        System.out.println(end2-start2);
    }
}
// "for-each" loop should not be used when you need to modify or remove elements from the collection during iteration.

