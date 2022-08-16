package polymorphism.runtime_polymorphism.method_overriding;

class A {
    void method(int a) {
        System.out.println("methodOne");
    }

    void method() {
        System.out.println("methodOne");
    }

    void method2() {
        System.out.println("method2One");
    }
}

class B extends A {
    @Override
    void method() {
        System.out.println("methodTwo");
    }

    @Override
    void method2() { // visibbility of inherited field cannot be changed
        System.out.println("method2Two");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.method(1); // methodOne
        obj.method2(); // method2One

        A obj2 = new B();
        obj2.method(2); // methodOne
        obj2.method(); // methodTwo (method overridden)
        obj2.method2(); // method2Two (method overridden)

        B obj3 = new B();
        obj3.method(); // methodTwo
        obj3.method(3); // methodOne
        obj3.method2();// method2Two (method overridden)
    }
}
