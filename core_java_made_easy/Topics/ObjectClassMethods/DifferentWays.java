package ObjectClassMethods;

public class DifferentWays {
    public static void main(String[] args) throws Exception {
        DifferentWays s1 = (DifferentWays) Class.forName("ObjectClassMethods.DifferentWays").newInstance();
        DifferentWays s2 = DifferentWays.class.getConstructor().newInstance();
        DifferentWays s3 = (DifferentWays) s2.clone();
    }
}
