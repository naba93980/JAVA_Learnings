package interfaceinjava;

interface Base1 {
    void methodOne();
}

interface Base2 {
    void methodTwo();
}

class Child implements Base1, Base2 {

    public void methodOne() {
        System.out.println("methodOne");
    }

    public void methodTwo() {
        System.out.println("methodTwo");
    }
}

public class Polymorphism_Interface {

    public static void main(String[] args) {
        Base2 obj2 = new Child();
        Base1 obj = new Child();
        obj.methodOne();
        obj2.methodTwo();
    }
}

/*
 * Polymorphsim via interfaces
 * Each interface is considered as a type.
 * An object of a class can be casted to the type of each interface it
 * implements.
 */
