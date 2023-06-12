package Inheritance.Super;

public class Test {
    public static void main(String[] args) {
        Child a = new Child();
        a.work();
        System.out.println(a instanceof Child);
        System.out.println(a instanceof Parent);
    }
}
