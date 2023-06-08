package StaticMembers;

public class StaticMethods {
    public static void main(String[] args) {
        System.out.println("Inside main");
        StaticMethods.method();
    }

    static void method() {
        System.out.println("Inside static method");
    }

    static {
        System.out.println("Inside static block");
        StaticMethods.method();
    }
}
