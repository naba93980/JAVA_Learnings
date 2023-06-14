package ExceptionHandling;

public class ArrayIndexOOB {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };

        try {
            System.out.println(arr[4]); // java.lang.ArrayIndexOutOfBoundsException:
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index entered is beyond size");
        }
    }
}
