package Java8Features.Function;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String, Integer> f = (s) -> s.length();    //like predicate but can return any type
        System.out.println(f.apply("hello"));

        Function<String, Integer> f2 = String::length;      // ContainingType::methodName - reference to an instance method of an arbitrary object of a particular type
        System.out.println(f2.apply("naba"));
    }
}
// map of js map, filter, reduce