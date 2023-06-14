package ExceptionHandling.Custom;

public class CustomCheckedExceptionClass extends Exception {
    CustomCheckedExceptionClass(String message){
        super(message);
    }
}

// custom checked exception class extends Exception class

// custom unchecked exception class extends RuntimeException class