package ExceptionHandling;

public class Throw {
    public static void main(String[] args) {
        try {
            throw new Exception("new custom runtime exception"); // throw new custom exception object
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
