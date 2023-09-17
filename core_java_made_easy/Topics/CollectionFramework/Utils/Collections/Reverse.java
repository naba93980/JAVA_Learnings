package CollectionFramework.Utils.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(34);
        l.add(22);
        l.add(78);
        l.add(66);
        System.out.println("Before reversing " + l);
        Collections.reverse(l);
        System.out.println("After reversing " + l);
    }
}
