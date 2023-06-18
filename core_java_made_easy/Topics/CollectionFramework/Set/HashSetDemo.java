package CollectionFramework.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<=10;i++){
            int number = random.nextInt(5);
            list.add(number);
        }
        System.out.println(list);

        Set<Integer> st=new HashSet<>(list);
        System.out.println(st);
    }
}
