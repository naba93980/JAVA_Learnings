package MapDemo;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new IdentityHashMap<>();
        map.put(new String("Alice"), 70);
        map.put(new String("Alice"), 20);

        Set<Map.Entry<String, Integer>> setMap = map.entrySet();
        System.out.println("Entry :");
        for (Map.Entry<String, Integer> entry : setMap) {
            System.out.println(entry);
        }
    }
}
