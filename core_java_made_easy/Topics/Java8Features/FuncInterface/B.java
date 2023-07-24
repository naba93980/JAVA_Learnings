package Java8Features.FuncInterface;

@FunctionalInterface
public interface B extends A {
    void myMethod();  // we can have the same method as in A for B to be functional interafce
    // void myMethod2(); // different method creates issues, as Functional Interface can hv just one method
}
