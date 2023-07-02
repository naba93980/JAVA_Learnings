package DateTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        for (String zone : ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }

        ZoneId ZID=ZoneId.of("Asia/Dhaka");

        ZonedDateTime dhakaDateTime = ZonedDateTime.now(ZID);
        System.out.println(dhakaDateTime);

        ZonedDateTime customZdt = ZonedDateTime.of(2000, 12, 15, 12, 30, 0, 50000, ZoneId.of("Asia/Kuala_Lumpur"));
        System.out.println(customZdt);
    }
}
