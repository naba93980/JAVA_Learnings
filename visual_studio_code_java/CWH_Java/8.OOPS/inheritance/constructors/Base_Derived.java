package inheritance.constructors;

class Base {

    int x;
    Base() {
        System.out.println("Base class constructor called\n");
    }

    Base(int a){
        System.out.println("Base class constructor called a:  "+a);
    }
};

class Derived extends Base {

    int y;

    Derived() {
        super(2000); //calling super class constructor
        System.out.println("Derived class constrcutor called");
    }

    Derived(int... arr) {
        super(arr[0]);
        System.out.println("Derived class constrcutor with args called : "+arr[1]);
    }
}
//First base class constructor is called, then derived class constructor is called


