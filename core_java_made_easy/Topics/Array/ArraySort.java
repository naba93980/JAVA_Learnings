package Array;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr={5,2,8,51,7};
        String[] arr2={"naba","jack","rohan","abahy"};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for (int e : arr) {
            System.out.println(e);
        }
        for (String string : arr2) {
            System.out.println(string);
        }
    }
}

// The Arrays.sort() method sorts array in ascending order, It is available for arrays of primitive types as well as arrays of objects.
// Arrays.sort() uses the natural ordering of the elements, which means it expects the elements to be comparable. 
// For custom objects, you can implement the Comparable interface or provide a custom Comparator to define the sorting order.

// Arrays.sort() method, it internally converts the primitive integers to their corresponding wrapper class objects (e.g., Integer) before performing the sorting operation.
// Because the wrapper class provides the necessary implementation of the Comparable interface for integer values.