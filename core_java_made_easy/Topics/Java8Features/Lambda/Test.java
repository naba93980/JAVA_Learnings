package Java8Features.Lambda;

public class Test {
    public static void main(String[] args) {
        Sum s = (a, b) -> System.out.println(a + b);
        s.add(5, 10);
    }
}
