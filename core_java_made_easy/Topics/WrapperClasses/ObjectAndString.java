package WrapperClasses;

public class ObjectAndString {
    public static void main(String[] args) {
        int a=100;
        Integer b = Integer.valueOf(a);     // converts to Integer object
        String c = b.toString();                  // Integer object to String object
        System.out.println(c);
        Integer d=Integer.valueOf(c);
        System.out.println(d);
    }
}
