package method.intro;

public class Main {

    static int logic(int x, int y) {
        return x + y;
    }

    static void print() {
        System.out.println(logic(5, 60));
    }

    void printHi() {
        System.out.println(logic(5, 60));
    }

    static int modify(int x) {
        return ++x;
    }

    public static void main(String[] args) {
        int f = 100;
        Main obj = new Main();

        System.out.println(logic(5, 6));
        print();
        obj.printHi();

        System.out.println(modify(f)); // f doesnot change bcoz its value was passed as call by value.
        System.out.println(f);

    }
}

// A static method provides NO reference to an instance of its class (it is a
// class method) hence, no, you cannot call a non-static method inside a static
// one.

// u can call a static method inside a non-static method

// https://www.linkedin.com/pulse/static-variables-methods-java-where-jvm-stores-them-kotlin-malisciuc