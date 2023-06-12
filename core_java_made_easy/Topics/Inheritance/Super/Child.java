package Inheritance.Super;

public class Child extends Parent {
    int a=20;   // shadows variable 'a' of parent class
    Child(){
        this(10);  // constructor chaining
        System.out.println("inside child constructor without args");
    }

    Child(int x){
        super(x);   // constructor chaining
        System.out.println("inside child constructor with args");
    }

    void work(){
        super.work();     // super keyword(different from super method) acts as a reference to the parent class
        System.out.println("work inside child");
        System.out.println(this);
        System.out.println(a);
        System.out.println(super.a);
    }
}
