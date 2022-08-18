package interfaceinjava;

interface Base {
    void method1();

    void method2();

    //static methods of interface doesnot gets derived
    static void defStatic() {
        System.out.println("def Static");
    }
    
    default void defDefault(){
        System.out.println("def Default");
    }
}

interface Derived extends Base {
    void method3();
    void method4();
}

class SampleClass implements Derived {

    public void method1() {
        System.out.println("method 1");
    }
    public void method2() {
        System.out.println("method 2");
    }
    public void method3() {
        System.out.println("method 3");
    }
    public void method4() {
        System.out.println("method 4");
    }
}
public class Interface_Inheritance {
    public static void main(String[] args) {
        SampleClass obj = new SampleClass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.defDefault();
        //Derived.defStatic();// not ok
        Base.defStatic(); // ok
    }
}
