package ExceptionHandling.CommonExceptions;

public class ArrOutOfBound {
    public static void main(String[] args) {
        int a[]=new int [20];
        System.out.println(a[20]);
    }
}

// https://stackoverflow.com/questions/28214703/why-do-we-use-new-keyword-with-primitive-data-types-like-boolean-to-create

//  in the statement String a[] = new String[5], a is an object of the dynamically generated class String[]