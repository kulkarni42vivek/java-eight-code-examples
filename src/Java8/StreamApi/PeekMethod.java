package Java8.StreamApi;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekMethod {
    public static void main(String[] args) {
        Stream.of(1,1,3,2,4,3)
                .peek(x->System.out.println("peek --> "+ x))
                .limit(3)
                .distinct()
                .forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------");
        IntStream.range(1, 6)
                .peek(i -> System.out.println("Before map: " + i))
                .map(i -> i * i)
                .peek(i -> System.out.println("After map: " + i))
                .sum();
    }
}
