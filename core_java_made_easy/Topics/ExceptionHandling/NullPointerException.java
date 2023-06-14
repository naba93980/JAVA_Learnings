package ExceptionHandling;

public class NullPointerException {
    private static Division d;
    public static void main(String[] args) {
        NullPointerException.d.f1();        // java.lang.NullPointerException
    }
}
