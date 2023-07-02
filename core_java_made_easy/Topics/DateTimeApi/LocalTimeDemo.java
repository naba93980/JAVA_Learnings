package DateTimeApi;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        System.out.println("TIME NOW :- ");
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        System.out.println(timeNow.getSecond());
        System.out.println(timeNow.getMinute());
        System.out.println(timeNow.getHour());

        LocalTime parsedTime = LocalTime.parse("15:22:00.502310900");
        System.out.println(parsedTime.getNano());


        System.out.println("CUSTOM TIME :- ");
        LocalTime customTime = LocalTime.of(22, 30, 28);
        System.out.println(customTime);

        System.out.println("PREVIOUS TIME :- ");
        System.out.println(timeNow.minusHours(15));

        if(timeNow.isBefore(customTime)){
            System.out.println("Ha bhai");  
        } else System.out.println("Na bhai");
    }
}
