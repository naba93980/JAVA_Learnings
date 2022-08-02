package array.intro;

public class Main {
    public static void main(String[] args) {

        int a[]; // declaration
        a = new int[3]; // memory allocation
        // by default memory gets initialized with zero

        int b[] = { 1, 2, 4, 5 }; // declaration + memory allocation + initialization

        int c[] = new int[5]; // declaration + memory allocation
        // initialization
        c[0] = 100;
        c[1] = 200;
        c[2] = 300;
        c[3] = 400;
        c[4] = 500;

        for (int i : c) {
            System.out.println(i);
        }

    }
}

// https://www.geeksforgeeks.org/array-primitive-type-object-java/

// https://www.geeksforgeeks.org/arrays-in-java/

/*
 * All arrays are created dynamically, using classes like int[], Integer[] and
 * new keyword
 * 
 * 
 * 
 * 
 * int marks[] = { 34, 56, 23, 78, 4, 78 };
 * marks[0].intValue();
 * 
 * Cannot invoke intValue() on the primitive type int
 * 
 * 
 * 
 * 
 * Integer[] g=new Integer[]{1,3,4,56,67};
 * g[0].intValue();
 * 
 */