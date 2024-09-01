package Java8.DateTimeApi;


import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationApi {
    public static void main(String[] args) throws InterruptedException {
        Duration duration  = Duration.between(LocalTime.NOON, LocalTime.MIDNIGHT);
        System.out.println(duration.get(ChronoUnit.SECONDS));

        Instant start  = Instant.now();
        Thread.sleep(2000);
        Instant end = Instant.now();

        System.out.println(Duration.between(start, end).get(ChronoUnit.SECONDS));

        Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(d2);
    }
}
