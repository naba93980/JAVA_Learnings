package Polymorphism;

class Parent{
    int x=5;
}
class Child extends Parent{
    int x=10;
}


public class RuntimeVariableDispatching {
    public static void main(String[] args) {
        Parent p1=new Parent();
        Parent c1=new Child();  
        System.out.println(p1.x);
        System.out.println(c1.x);   // variable of Parent class gets called, so unlike method dispatching, variable dispatching doesnot work
    }
}
