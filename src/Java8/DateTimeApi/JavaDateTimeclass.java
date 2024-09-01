package Java8.DateTimeApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDateTimeclass {
    public static void main(String[] args) {
        LocalDateTime time  = LocalDateTime.now();
        System.out.println(time);
        System.out.println(time.getMinute());
        System.out.println(time.getHour());
        System.out.println(time.getSecond());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM--yyyy");
        String timev = time.format(formatter);
        System.out.println(timev);

//        LocalDateTime timer = LocalDateTime.of();

    }
}
