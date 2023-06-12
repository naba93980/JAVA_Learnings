package Inheritance.Super;

public class Parent {
    int a=10;
    Parent(){
        System.out.println("inside parent constructor without args");
    }

    Parent(int x){
        this();  // constructor chaining
        System.out.println("inside parent constructor with args");
    }
    /* final */ void work(){
        System.out.println("work inside parent");
        System.out.println(this);
    }
}

// final method cant be overriden