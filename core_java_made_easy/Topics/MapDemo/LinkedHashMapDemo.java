package MapDemo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer>map=new LinkedHashMap<>();
        map.put("Alice", 70);
        map.put("Bob", 60);
        map.put("John", (90));
        map.put("Naba", 20);

        Set<Map.Entry<String,Integer>>setMap=map.entrySet();
        System.out.println("Entry :");
        for (Map.Entry<String,Integer> entry : setMap) {
            System.out.println(entry);
        }

        Set<String> keySet=map.keySet();
        System.out.println("Key :");
        for (String key : keySet) {
            System.out.println(key);
            System.out.println(map.get(key));
        }

        Collection<Integer> values=map.values();
        System.out.println("Values :");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
