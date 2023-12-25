package Java8Features.Predicate;

import java.util.function.Predicate;

public class PredicateJoins {

    static void method(Predicate<Integer> p, int[] x) {
        for (int j : x) {
           if(p.test(j))
           System.out.println(j);
        }
    }

    public static void main(String[] args) {

        int[] x = { 0, 21, 34, 56, 60, 87, 120 };
        Predicate<Integer> p1 = i -> i < 50;
        Predicate<Integer> p2 = i -> i %2 == 0;
        System.out.println("lesser than 50");
        method(p1, x);

        System.out.println("greater than 50");
        method(p1.negate(), x);

        System.out.println("greater than 50 & even");
        method(p1.negate().and(p2), x);

        System.out.println("greater than 50 or even");
        method(p1.negate().or(p2), x);
    }

}
