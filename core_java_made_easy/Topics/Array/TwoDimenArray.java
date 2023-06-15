package Array;

public class TwoDimenArray {
    public static void main(String[] args) {
        int matrix[][] = new int[][]{{1,2},{3,4}};

        for (int outer[] : matrix) {
            for (int inner : outer) {
                System.out.printf("%d", inner);
            }
            System.out.println();
        }
    }
}
