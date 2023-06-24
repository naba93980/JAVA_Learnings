package StringHandling;

public class SBMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello, there \n");
        System.out.println("initial cap : " + sb.capacity());
        sb.append("hi, myself naba, i love to play chess", 0, 18);
        System.out.println(sb);
        System.out.println(sb.insert(3, "xyz"));
        System.out.println(sb.delete(3, 6));
        System.out.println("initial cap : " + sb.capacity());
        System.out.println(sb.reverse());
    }
}

// string buffer - thread safe, synchronised thus impacts performance
// string builder - not thread safe
// both have similar API