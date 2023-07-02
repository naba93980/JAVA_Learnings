package DateTimeApi;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DurationDemo {
    public static void main(String[] args) {

        long sum = 0;

        Instant start = Instant.now();
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }
        Instant end = Instant.now();
        Duration timeNeeded = Duration.between(start, end);
        System.out.println(timeNeeded.toMillis());


        // create custom duration for certain units
        Duration d = Duration.of(5, ChronoUnit.DAYS);
        System.out.println(d);
        System.out.println(d.getSeconds());
        
        Duration dH = Duration.ofHours(2);
        System.out.println(dH);

    }
}
