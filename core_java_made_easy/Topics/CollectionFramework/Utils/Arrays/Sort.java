package CollectionFramework.Utils.Arrays;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        Integer a[] = { 40, 15, 78, 28 };
        System.out.println("Before sorting - ");
        for (int i : a) {
            System.out.println(i);
        }
        Arrays.sort(a);
        System.out.println("After sorting - ");
         for (int i : a) {
            System.out.println(i);
        }
        Arrays.sort(a, new MyComparator());
        System.out.println("After sorting using comparator- ");
         for (int i : a) {
            System.out.println(i);
        }
    }
}
