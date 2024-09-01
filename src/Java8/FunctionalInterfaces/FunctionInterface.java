package Java8.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionInterface {

    public static void main(String[] args) {
        Function<Integer, Integer> function = integer -> integer*5;
        System.out.println(function.apply(2));
    }
}
