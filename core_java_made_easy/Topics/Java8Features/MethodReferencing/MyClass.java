package Java8Features.MethodReferencing;


// could have rather implemented the MyInterface interface and define the method
public class MyClass {
    public void myMethodClass(int i){
        System.out.println("hello ji " + i);
    }

    public static void main(String[] args) {

        MyClass mc = new MyClass();
        MyInterface r = mc::myMethodClass; // map instance method to functional interface
        r.myMethodInt(5);

    }
}
