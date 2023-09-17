package CollectionFramework.Utils.Arrays;

import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        Integer a[] = { 40, 15, 78, 28 };
        List<Integer> list = Arrays.asList(a);
        System.out.println(list);
        a[0]=500;
        System.out.println(list);   // changes in list will get reflected in array and vice-versa but any operation in list that changes the size of array will throw exception
    }
}
