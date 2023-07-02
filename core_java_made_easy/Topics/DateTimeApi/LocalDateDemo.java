package DateTimeApi;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {

        System.out.println("DATE NOW :- ");
        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);
        System.out.println(dateNow.getYear());
        System.out.println(dateNow.getMonth());
        System.out.println(dateNow.getDayOfMonth());


        System.out.println("CUSTOM DATE :- ");
        LocalDate customDate = LocalDate.of(2000, 1, 28);
        System.out.println(customDate);
        System.out.println(customDate.getMonthValue());

        System.out.println("PREIOUS DATE :- ");
        System.out.println(dateNow.minusMonths(100));
        System.out.println(dateNow.minusDays(100));

        if(dateNow.isBefore(customDate)){
            System.out.println("Ha bhai");  
        } else System.out.println("Na bhai");
    }
}
