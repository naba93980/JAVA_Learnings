package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(45);
        list.add(25);
        list.add(75);
        list.add(115);

        System.out.println(list);
        Iterator<Integer>itr= list.iterator();   // itr is object of innerclass ArrayList.Itr, which extends Iterator interface

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

// Iterator is interface, implemented by innerclass (like ArrayList.Itr) of specific collection like ArrayList, LinkedList etc.