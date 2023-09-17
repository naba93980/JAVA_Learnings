package CollectionFramework.Utils.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrays {
    public static void main(String[] args) {
        String s1[] = {"A", "B", "C"};
        String s2[] = {"D", "E", "F"};

        List<String> list1 = new ArrayList<>(Arrays.asList(s1));
        List<String> list2 = new ArrayList<>(Arrays.asList(s2));
        list1.addAll(list2);

        System.out.println(list1);
    }
}
