package ExceptionHandling.Custom;

public class CustomException {
    public static void main(String[] args) {
        try {
            throw new CustomCheckedExceptionClass("Error from custom exception class");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
