package array.arrminmax;

import java.lang.Integer;

public class ArrMinMax {
    public static void main(String[] args) {
        int ar[] = { 34, 12, 56, 34, 23, 456, 63, 3423, -545 };
        int max = Integer.MIN_VALUE;
        for (int i : ar) {
            if (i > max)
                max = i;
        }
        System.out.println(max);

        int min = Integer.MAX_VALUE;
        for (int i : ar) {
            if (i < max)
                min = i;
        }
        System.out.println(min);
    }
}
