package WrapperClasses;

public class PrimitiveAndObject {
    public static void main(String[] args) {
        int a =100;
        Integer b = Integer.valueOf(a);
        System.out.println(b);
        int c = b.intValue();
        byte d = b.byteValue();
        System.out.println(c);
        System.out.println(d);
    }
}
