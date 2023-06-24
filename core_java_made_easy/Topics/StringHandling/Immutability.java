package StringHandling;

public class Immutability {
    public static void main(String[] args) {
        String s1 = "naba";
        String s2 = "naba";
        System.out.println(s1 instanceof String);
        s1.concat("modak"); // a new string oject created at string pool of jvm

        // s1, s2 points to same location in string pool, also same hshcode as contents of both objects
        // are same
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String s3 = new String("naba");
        String s4 = new String("naba");

        // s3, s4 points to different location in heap and same hshcode as contents of both objects
        // are same
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

    }
}
