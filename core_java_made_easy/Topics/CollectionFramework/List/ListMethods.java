package CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();      // keep the interface at left so that runtime polymorphism can be applied, and if required ArrayList can be replaced by LinkedList data structure
        // list.add(10.7);
        list.add(Integer.valueOf(20));

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("list : " + list);

        // insert
        list.add(3, Integer.valueOf(0));
        System.out.println("list : " + list);

        // replace
        list.set(3, 456);

        System.out.println("list : " + list);

        List<Integer> secondList = new ArrayList<>();
        secondList.add(-111);
        secondList.add(-222);
        secondList.add(-333);

        System.out.println("Second List:" + secondList);

        list.addAll(5, secondList);
        System.out.println("list : " + list);
        

    }
}
