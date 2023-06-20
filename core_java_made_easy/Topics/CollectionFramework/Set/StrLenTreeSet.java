package CollectionFramework.Set;

import java.util.Set;
import java.util.TreeSet;

import StringBufferComparator.StrLenComparator;

public class StrLenTreeSet {
    public static void main(String[] args) {

        Set<String> setString = new TreeSet<>(new StrLenComparator());
        setString.add("xyztret");
        setString.add("axberew");
        setString.add("abctrtettttrt");
        setString.add("def");

        for (String obj : setString) {
            System.out.println(obj);
        }
    }
}
