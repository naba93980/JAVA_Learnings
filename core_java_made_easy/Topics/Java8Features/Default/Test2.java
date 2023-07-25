package Java8Features.Default;

// both A, AA has same default methods, so overriding is must
public class Test2 implements A,AA{
    @Override
    public void method1() {
        AA.super.method1();  // or u can provide ur own custom imlementation
    }

    public static void main(String[] args) {
        Test2 t2=new Test2();
        t2.method1();
    }
}
