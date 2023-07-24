package Java8Features.FuncInterface;

public class Test {
    public static void main(String[] args) {
        // A a = new C();
        A a = () -> System.out.println("inside myMethod - lambda"); // similar to anonymous class, only that here we are defining the only method of FunctionalInterface, whereas in anonymous class, we defined the entire class using the base interface name
        a.myMethod();
    }
}

// in js with "new ()=> {}'', you cant create object, u can do that with "new fnName()" where the functionn acts as constructor
// in java u can use lambda expression to define class that implements interface and also instantiate its object(like anonymous classes)