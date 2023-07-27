package Java8Features.Predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer>result=(i)->i>20;      // you don't need to explicitly provide a return statement because the method's return type is implicitly defined as boolean, and the expression or statement inside the lambda body will be used as the return value.
    }
}

// Using generics, primitive types can not be passed as type parameter so Integer is used above and not int