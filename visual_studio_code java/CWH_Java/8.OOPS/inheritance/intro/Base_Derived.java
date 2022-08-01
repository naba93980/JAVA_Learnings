package inheritance.intro;

class Base {

    int id = 100;
    
    protected int roll = 100;
    // if it was private then derived class would not have been able to access it directly

    private int classs = 12;
    // here this private field is access using default getClasss() method

    void getClasss() {
        System.out.println("class : " + this.classs);
    }
};

class Derived extends Base {
    
    void get() {
        System.out.println("roll : " + this.roll + " id : " + this.id);
    }

    Derived(int... arr) {
        this.roll = arr[0];
        this.id = arr[1];
        this.getClasss();
    }

    Derived() {
    }
}
