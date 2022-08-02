package array.multidimensional;

public class MatrixAdd {
    public static void main(String[] args) {
        int matOne[][] = { { 1, 2 }, { 1, 7 } };
        int matTwo[][] = { { 1, 2 }, { 1, 2 } };
        int res[][] = new int[matOne.length][matOne[0].length];

        for (int i = 0; i < matOne.length; i++) { // row number of times
            for (int j = 0; j < matOne[i].length; j++) { // column number of times
                res[i][j] = matOne[i][j] + matTwo[i][j];
            }
        }
        for (int[] i : res) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println("\n");
        }
    }
}
