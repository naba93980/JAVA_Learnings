package DateTimeApi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(2000, 1, 28);
        Period p = Period.between(then, now);
        Period p2 = p.plusMonths(4);
        System.out.println(p2);
        System.out.println(Period.of(23, 5, 5));
    }
}

// Period is for date
// Duration is for time