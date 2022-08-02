package array.display;

public class Main {
    public static void main(String[] args) {
        float a[] = { 11.6f, 2, 4, 5 };
        String b[] = { "naba", "jyoti", "modak" };

        // foreach loop//

        for (float val : a) {
            System.out.println(val);
        }

        for (String val : b) {
            System.out.println(val);
        }

        // for loop//

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
//You're changing the iteration variable c. That doesn't change the contents of the array. The iteration variable is just a copy of the array element. If you want to modify the array, you need to do so explicitly: