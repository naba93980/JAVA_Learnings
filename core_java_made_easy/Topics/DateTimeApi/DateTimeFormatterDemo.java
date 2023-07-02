package DateTimeApi;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate l = LocalDate.now();
        System.out.println(l);
        String formattedl = l.format(myFormatter);
        System.out.println(formattedl);

        LocalDate parsedl = LocalDate.parse("2023-07-02");
        System.out.println(parsedl);
        LocalDate parsedFormattedl = LocalDate.parse("02/07/2023", myFormatter);
        System.out.println(parsedFormattedl);

        String dateTimeString = "2023/04/24 06:30:45+05:30";
        DateTimeFormatter myZonedFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ssXXX"); // -----> "2023/04/24 06:30:45+05:30"
        // DateTimeFormatter myZonedFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss z");   //--------> "2023/04/24 06:30:45 Asia/Calcutta"
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTimeString,myZonedFormatter);
        System.out.println(zonedDateTime);

    }
}


// y - year
// M - month of year
// d - day of month
// H - hour of day (0-23)
// h - hour of am/pm (1-12)
// m - minute of hour
// s - second of minute
// S - fraction of second
// a - am/pm marker
// E - day of week
// D - day of year
// F - day of week in month
// w - week of year
// W - week of month
// k - hour of day (1-24)
// K - hour of am/pm (0-11)
// z - time zone name
// Z - time zone offset