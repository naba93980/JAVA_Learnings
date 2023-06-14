package ExceptionHandling.CommonExceptions;

public class ClassCastError {
    public static void main(String[] args) {
        Object obj = new Object();
        String s = (String) obj; // java.lang.Object cannot be cast to class java.lang.String
    }
}

// String class extends Object class, you cannot typecast a parent object to a child reference variable but u can typecast child object to a parent reference variable