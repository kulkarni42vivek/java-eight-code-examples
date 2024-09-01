package Java8.DateTimeApi;

import java.time.Instant;

public class InstantOne {
    public static void main(String[] args) {
        Instant one  = Instant.now();
        System.out.println(one);
        System.out.println(one.getEpochSecond());
        System.out.println(one.plusMillis(1000));
    }
}
