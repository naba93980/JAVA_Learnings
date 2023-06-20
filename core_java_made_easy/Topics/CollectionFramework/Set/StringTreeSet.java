package CollectionFramework.Set;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import StringBufferComparator.SBComparator;

public class StringTreeSet {
    public static void main(String[] args) {

        // String objects in set - implements comparable, overrides equals

        Set<String> setString = new TreeSet<>();
        setString.add("xyztret");
        setString.add("axberew");
        setString.add("abctrtettttrt");
        setString.add("def");

        for (String obj : setString) {
            System.out.println(obj);
        }

        System.out.println("------------------------");

        // From java 11 StringBuffer objects in set - implements comparables but doesnot override equals

        Set<StringBuffer> setStringBuffer = new TreeSet<>(Comparator.reverseOrder());
        setStringBuffer.add(new StringBuffer("xyz"));
        setStringBuffer.add(new StringBuffer("axb"));
        setStringBuffer.add(new StringBuffer("abc"));
        setStringBuffer.add(new StringBuffer("def"));

        for (StringBuffer obj : setStringBuffer) {
            System.out.println(obj);
        }
        System.out.println("------------------------");


        // StringBuilder objects in set - implements comparables but doesnot override equals

        Set<StringBuilder> setStringBuilder = new TreeSet<>(Comparator.reverseOrder());
        setStringBuilder.add(new StringBuilder("xyz"));
        setStringBuilder.add(new StringBuilder("axb"));
        setStringBuilder.add(new StringBuilder("abc"));
        setStringBuilder.add(new StringBuilder("def"));

        for (StringBuilder obj : setStringBuilder) {
            System.out.println(obj);
        }
    }
}


// https://stackoverflow.com/questions/66114916/stringbuilder-implements-comparable-but-does-not-override-equals

// https://www.javatpoint.com/Comparable-interface-in-collection-framework

// https://www.javatpoint.com/Comparator-interface-in-collection-framework

// https://www.baeldung.com/java-comparator-comparable