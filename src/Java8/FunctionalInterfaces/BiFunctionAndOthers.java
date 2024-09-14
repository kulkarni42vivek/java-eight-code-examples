package Java8.FunctionalInterfaces;


import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Bifunc implements BiFunction<List<Integer> , List<Integer> , List<Integer>>{

    @Override
    public List<Integer> apply(List<Integer> integers, List<Integer> integers2) {
        return Stream.of(integers,integers2).flatMap(List::stream).distinct().collect(Collectors.toList());
    }
}

public class BiFunctionAndOthers {
    public static void main(String[] args) {
        // ---- 1
        BiFunction<List<Integer> , List<Integer> , List<Integer>> bifunc  =(o1, o2) -> {
            return Stream.of(o1,o2).flatMap(List::stream).distinct().collect(Collectors.toList());
        };

        List<Integer> apply = bifunc.apply(List.of(1, 25, 1, 12), List.of(12, 14, 5));
        System.out.println(apply);

        // --- 2
        BiFunction<List<Integer> , List<Integer> , List<Integer>> bifunc2 = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> o1, List<Integer> o2) {
                return Stream.of(o1,o2).flatMap(List::stream).distinct().collect(Collectors.toList());
            }
        };
        List<Integer> app2 = bifunc2.apply(List.of(1, 25, 1, 12), List.of(12, 14, 5));

        System.out.println(app2);

        // --------- 3
        Bifunc bif = new Bifunc();
        List<Integer> apply1 = bif.apply(List.of(1, 25, 1, 12), List.of(12, 14, 5));
        System.out.println(apply1);

        // --------- 4
        Function<List<Integer> , List<Integer>> sorte = o1 ->{
            return o1.stream().sorted().collect(Collectors.toList());
        };
        List<Integer> apply2 = bif.andThen(sorte).apply(List.of(1, 25, 1, 12), List.of(12, 14, 5));
        System.out.println(apply2);


        // ->> biconsumer

        BiConsumer<String , String> consume = (s, s2) -> {
            System.out.println(s+ s2);
        };
        consume.accept("one" , "two");
    }
}
