package InnerClass.staticinner;

public class Outer {

    int x;

    static void f1Outer() {
        System.out.println("static method of outer class");
    }

    void f11Outer() {
        System.out.println("non-static method of outer class");
    }

    // STATIC INNER CLASS
    static class StaticInner {

        // int y=x; // a static nested class cannot refer directly to instance variable or methods defined in its enclosing class

        static void f2Inner() {
            Outer.f1Outer();
            System.out.println("static method of static inner class");
        }

        void f3Inner() {
            System.out.println("non static method of static inner class");
        }
    }


    // NON STATIC INNER CLASS
    class NonStaticInner {

        // static inside non static not allowed
        // static void f4Inner() {
        //     System.out.println("static method of non static inner class");
        // }

        void f5Inner() {
            
            // A non-static nested class has full access to the members(static or non static) of the class within which it is nested.
            int y = x; 
            Outer.f1Outer();                

            System.out.println("non static method of non static inner class " + y);


            Outer.this.f11Outer();      // Outer.this representsinstance of the outer class
            this.f6inner();                  // this represents objects of inner  class
        }

        void f6inner() {
            System.out.println("f6");
        }
    }

    public static void main(String[] args) {
        Outer.f1Outer();

        Outer.StaticInner.f2Inner();
        Outer.StaticInner staticInnerObj = new Outer.StaticInner();
        staticInnerObj.f3Inner();

        Outer outerObj = new Outer();
        Outer.NonStaticInner nonStaticInnerObj = outerObj.new NonStaticInner();
        nonStaticInnerObj.f5Inner();
        outerObj.f11Outer();
    }
}

/*
 * Because an instance of an inner class is implicitly associated with an
 * instance of its outer class, it cannot define any static methods itself.
 * Since a static nested class cannot refer directly to instance variables or
 * methods defined in its enclosing class, it can use them only through an
 * object reference, it's safe to declare static methods in a static nested
 * class.
 */

// static inner class can access the static members of the outer class directly.
// to access the instance members of the outer class you need to instantiate the
// outer class.

// https://www.geeksforgeeks.org/difference-between-static-and-non-static-nested-class-in-java/