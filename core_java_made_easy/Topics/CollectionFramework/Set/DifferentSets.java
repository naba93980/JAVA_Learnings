package CollectionFramework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class DifferentSets {
    public static void main(String[] args) {
        Random r = new Random();

        // HashSet<Integer> set = new HashSet<>();                       // order of entry not maintained
        // LinkedHashSet<Integer> set=new LinkedHashSet<>();   // order of entry maintained
        TreeSet<Integer> set = new TreeSet<>();                           // order of entry is not maintained but sorted

        for (int i = 0; i < 10; i++) {
            int number=r.nextInt(5);
            set.add(number);
            System.out.println(number);
        }

        System.out.println(set);
        
    }
}
