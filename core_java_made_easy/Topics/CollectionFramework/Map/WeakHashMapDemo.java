package CollectionFramework.Map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<User, String> map = new WeakHashMap<>();
        User user = new User();
        map.put(user, "Tom");
        System.out.println(map);
        user=null;
         System.gc();    // Garbage collector has dominance over the WeakHashMap, if a key object is not referenced anywhere outside the WeakHashMap, then it is garbage collected
        Thread.sleep(3000);
        System.out.println(map);
    }
}