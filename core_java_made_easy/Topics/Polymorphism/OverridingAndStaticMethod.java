package Polymorphism;

class Parent2{
    public static void doSomething(){
        System.out.println("inside parent2");
    }
}

class Child2{
    public static void doSomething(){
        System.out.println("inside child2");
    }
}

public class OverridingAndStaticMethod {
 public static void main(String[] args) {
        // Call the static method doSomething() from the Parent class
        Parent2.doSomething();
        Child2.doSomething();
    }
}

// https://stackoverflow.com/questions/10291949/are-static-methods-inherited-in-java