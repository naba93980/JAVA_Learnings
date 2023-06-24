package StringHandling;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "naba";
        String s2 = "naba";

        String s3 = new String("naba");
        String s4 = new String("naba");
        String s5 = new String("modak");

        // compares memory location
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);

        // compares actual content
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
    }
}
