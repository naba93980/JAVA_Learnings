package DateTimeApi;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {

        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);
        LocalDateTime customdateTimeNow = LocalDateTime.of(2000, 1, 28, 2, 30, 45);
        System.out.println(customdateTimeNow);

    }
}
