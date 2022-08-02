package method.overloading;

public class Main {

    static int add(int x, int y, int z) {
        return x + y + z;
    }

    static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(add(4, 5, 6));
        System.out.println(add(4, 7));

    }
}
