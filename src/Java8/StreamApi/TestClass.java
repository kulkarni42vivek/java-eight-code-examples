package Java8.StreamApi;

import java.util.stream.Stream;

public class TestClass {
    public static void main(String[] args) {
        Stream.of(1,1,3,2,4,3)
                .peek(x->System.out.println("peek --> "+ x))
                .limit(3)
                .distinct()
                .forEach(System.out::println);
    }
}
