package Java8.DateTimeApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateApi {
    public static void main(String[] args) {
        LocalDate date  = LocalDate.now();
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd---MM-yyyy");
        String output  = date.format(formatter);
        System.out.println(output);

        LocalDate daten = LocalDate.of(2500,05,02);
        System.out.println(daten.getMonth());

        
    }
}
