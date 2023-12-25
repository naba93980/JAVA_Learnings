package Java8Features.Function;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String, Integer> f = (s) -> s.length();    //like predicate but can return any type
        System.out.println(f.apply("hello"));
    }
}
