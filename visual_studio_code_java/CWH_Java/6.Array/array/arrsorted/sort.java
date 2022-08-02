package array.arrsorted;

public class sort {
    public static void main(String[] args) {
        int ar[] = { 34, 12, 56, 34, 23, 456, 63, 3423, -545 };
        int arr[] = { 34, 124, 566, 3477, 23666, 45666, 63666, 342367 };
        boolean sorted = true;
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
            }
        }
        if (sorted) {
            System.out.println("sorted");
        } else {
            System.out.println("false");
        }
    }

}
