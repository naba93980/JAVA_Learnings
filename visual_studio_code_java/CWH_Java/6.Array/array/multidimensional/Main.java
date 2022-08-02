package array.multidimensional;

public class Main {
    public static void main(String[] args) {

        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        for (int[] i : a) {
            for (int j : i) {
                System.out.println(j);
            }
        }

        String items[][] = new String[][] {
                { "apples", "oranges" },
                { "coke", "sprite", "7up" }
        };

        for (String[] strings : items) {
            for (String item : strings) {
                System.out.println(item);
            }
        }
    }
}
