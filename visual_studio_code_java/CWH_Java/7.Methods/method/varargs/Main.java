package method.varargs;

public class Main {
    static int sum(int... arr) // like rest operator in javascript
    {
        int res = 0;
        for (int i : arr) {
            res = res + i;
        }
        return res;
    }

    static int sum2(int x, int... arr) // like rest operator in javascript
    {
        int res = 0;
        for (int i : arr) {
            res = res + i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(2, 5));
        System.out.println(sum(2, 3, 4));
        System.out.println(sum(2, 3, 4, 5));
        System.out.println("---------------");
        System.out.println(sum2(2));
        System.out.println(sum2(2, 5));
        System.out.println(sum2(2, 3, 4));
        System.out.println(sum2(2, 3, 4, 5));
    }
}
