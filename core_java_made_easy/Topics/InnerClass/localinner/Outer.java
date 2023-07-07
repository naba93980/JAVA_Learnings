package InnerClass.localinner;

public class Outer {
    int x;
    void f1() {
        System.out.println("inside outer f1()");
        class LocalInner {          // this class cant have any access specifier
            int y=x+5;         // x same as Outer.this.x
            void f2() {
                System.out.println("inside local inner f2  : "+y);
            }
        }
        LocalInner li = new LocalInner();
        li.f2();
    }

    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.x=10;
        outer.f1();

        Outer outer2=new Outer();
        outer2.x=20;
        outer2.f1();
    }
}

// local inner class are classes defined inside methods, blocks, constructor,
// and can be accessed only from inside them