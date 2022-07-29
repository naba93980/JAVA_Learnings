package array.arrayreverse;

public class ArrRev {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int temp;
        int i = 0;
        while (i <= a.length - 1 - i) { // i=0 j=a.length-1 , i=1 j=a.length-2
            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
            i++;
        }
        for (int k : a) {
            System.out.print(k + " ");
        }
    }
}
