package StringHandling;

public class StringDemo {
    public static void main(String[] args) {
        String s = "hello"; // values stored in string pool, immutable
        String so = new String("world");
        char[] c = { 'n', 'a', 'b', 'a' };
        byte[] b = { 65, 67, 68 };
        String sb = new String(b);  // object stored in heap, immutable

        System.out.println(s);
        System.out.println(so);
        System.out.println(c);
        System.out.println(sb);

    }
}
