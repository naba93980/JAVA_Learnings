package DateTimeApi;

import java.time.Instant;
import java.time.ZoneId;

public class InstantDemo {
    public static void main(String[] args) {

        long currentTimeMilliseconds = System.currentTimeMillis();
        System.out.println(currentTimeMilliseconds);

        Instant now = Instant.now();
        System.out.println(now); // 2023-07-02T15:00:17.906629400Z -> nano seconds, Z means UTC
        System.out.println(now.toEpochMilli());
        System.out.println(now.atZone(ZoneId.of("Asia/Calcutta")));
    }
}
