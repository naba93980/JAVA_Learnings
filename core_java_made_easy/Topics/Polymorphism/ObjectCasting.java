package Polymorphism;

interface Test {
    public void print();
}

class TestImplemement implements Test {
    public void print() {
        System.out.println("Hello");
    }

    public void print2(){
        System.out.println("Hello2");
    }
}

public class ObjectCasting {
    public static void main(String[] args) {
        Test testImplementation = new TestImplemement();
        Object o = testImplementation; // upcasting
        TestImplemement testImplemementdowncast = (TestImplemement) o; // downcast, whenever u want to invoke a functionality in child class
        testImplemementdowncast.print2();

    }
}
