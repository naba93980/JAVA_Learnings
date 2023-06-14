package ExceptionHandling;

public class StringParser {
    public static void main(String[] args) {
        try {
            String s=args[0];
            int i=Integer.parseInt(s); // throws  java.lang.NumberFormatException
            System.out.println(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter a number plz");
        } catch (NumberFormatException e){
            System.out.println("Enter correct number string plz ");
        }
        System.out.println("More code can go here");
    }
}
