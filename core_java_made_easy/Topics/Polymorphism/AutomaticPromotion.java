package Polymorphism;

class Parent {

}

class Child extends Parent {

}

class GrandChild extends Child {

}

public class AutomaticPromotion {
    public void print(long i){
        System.out.println("long "+i);
    }
    public void print(float i){
        System.out.println("float "+i);
    }

    public void print(String s){
        System.out.println("String class is called");
    }

    public void print(Object s){
        System.out.println("Object class is called");
    }

    public void print(Parent o){
        System.out.println("Inside parent");
    }

    public void print(Child o){
        System.out.println("Inside child");
    }

    public static void main(String[] args) {
        AutomaticPromotion a=new AutomaticPromotion();
        a.print(123);   // next immediate promoted type gets called, here it is long (integer)
        a.print(12.58f);
        a.print("Hello");
        a.print(new GrandChild());  // next immediate promoted to Child type first then Parent type if Child type doesnot exist
    }
}


// automatic promotion of objects