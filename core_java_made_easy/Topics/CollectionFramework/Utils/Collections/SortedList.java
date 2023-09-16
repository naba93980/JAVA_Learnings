package CollectionFramework.Utils.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Z");
        l.add("h");
        l.add("d");
        l.add("B");

        System.out.println("Before sorting "+ l.toString());

        Collections.sort(l, new MyComparator());

        System.out.println("After sorting "+ l.toString());  // only l will also work as toString() is called automatically when we try to print an instance

        int result = Collections.binarySearch(l, "Z");  // if u remove new MyComparator() then it wont work
        System.out.println(result);
    }
}
