package CollectionFramework.Set.NavigableSet;

import java.util.Random;
import java.util.TreeSet;

public class NavigableTreesetDemo {
    public static void main(String[] args) {

        Random r = new Random();
        TreeSet<Integer> set = new TreeSet<>();         

        for (int i = 0; i < 10; i++) {
            int number=r.nextInt(9);
            set.add(number);
            System.out.println(number);
        }
        System.out.println(set);
        System.out.println(set.floor(5));
        System.out.println(set.lower(5));
        System.out.println(set.ceiling(8));
        System.out.println(set.higher(1));
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        System.out.println(set.descendingSet());
    }
}
