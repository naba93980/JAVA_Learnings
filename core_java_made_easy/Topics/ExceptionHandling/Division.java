package ExceptionHandling;

import java.util.Scanner;

public class Division {
    public void f1() {

    }

    public static void main(String[] args) {
        int a, b, c;
        try {
            System.out.println("Enter 2 ints");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            sc.close();
            c = a / b;
            System.out.printf("Result %d\n", c);
        } catch (ArithmeticException e) {
            System.out.println("Enter the numbers correctly");
        }
        // block executes even if error thrown or not
        finally{   
            System.out.println("Finally Bye Bye");
        }
        System.out.println("Tata khatam bye bye");
    }
}
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at ExceptionHandling.Division.main(Division.java:12)

// java.lang.ArithmeticException -> builtin class in java