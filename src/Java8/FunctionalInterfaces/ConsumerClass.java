package Java8.FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerClass {
    public static void main(String[] args) {
        Consumer<Integer> consumer = new Consumer<>() {
            @Override
            public void accept(Integer o) {
                System.out.println(o);
            }
        };

        consumer.accept(15);

        Consumer consume = o -> System.out.println(o);
        consume.accept(25);
    }
}
