package Java8Features.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapNames {
    public static void main(String[] args) {
         List<String> l1 = new ArrayList<>();
        l1.add("hfghghg");
        l1.add("eutirttu");
       

        List<String> r = l1.stream().map((s)->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(r);

    }
}
