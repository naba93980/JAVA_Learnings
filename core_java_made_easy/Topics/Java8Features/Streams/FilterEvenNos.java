package Java8Features.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNos {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(56);
        l1.add(54);
        l1.add(23);
        l1.add(78);
        l1.add(90);
        l1.add(11);

        List<Integer> r = l1.stream().filter((i)->i%2==0).collect(Collectors.toList());
        System.out.println(r);

        long c = l1.stream().filter((i)->i%2==0).count();
        System.out.println(c);

        Comparator<Integer> comp = (i1, i2)->i2.compareTo(i1);

        List<Integer> sl = l1.stream().filter((i)->i%2==0).sorted(comp).collect(Collectors.toList());
        System.out.println(sl);
        l1.stream().forEach((i)->System.out.println(i));
    }
}
