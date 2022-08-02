package recursion;

public class Main {

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int fact = 0;
        fact = n * factorial(n - 1);
        return fact;
    }

    static long fib(int n, long fibArr[]) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (fibArr[n] != 0) {
            return fibArr[n];
        }
        long fib = fib(n - 1, fibArr) + fib(n - 2, fibArr);
        fibArr[n] = fib;
        return fib;
    }

    public static void main(String[] args) {
        int n = 10000;
        long arr[] = new long[n];
        System.out.println(factorial(5));
        System.out.println(fib(50, arr));
    }
}
