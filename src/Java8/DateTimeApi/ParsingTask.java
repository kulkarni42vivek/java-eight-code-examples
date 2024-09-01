package Java8.DateTimeApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ParsingTask {
    public static void main(String[] args) {
        String tiem  = "24-02/2000";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM/yyyy");
        LocalDate time = LocalDate.parse(tiem, formatter);
        System.out.println(time);
    }
}
