package ImpClasses;

public class MyImmutability {

    public int x;

    MyImmutability(int x) {
        this.x = x;
    }

    public MyImmutability change(int x) {
        if (this.x == x) {
            return this;
        } else {
            return new MyImmutability(x);
        }
    }

    public static void main(String[] args) {
        MyImmutability mi=new MyImmutability(5);
        MyImmutability newmi=mi.change(50); // new object is returned 
        System.out.println(mi==newmi);
    }
}
