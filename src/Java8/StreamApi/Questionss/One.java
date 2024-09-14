package Java8.StreamApi.Questionss;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class One {
    public static void main(String[] args) {
        List<Integer> list = List.of(25,12,41,63,22,5,22,25);

        // for first element
        list.stream().findFirst().ifPresent(System.out::println);

        // for total
        Long collect = list.stream().collect(Collectors.counting());
        System.out.println(collect);
        System.out.println(list.stream().count());

        // find out all odd even numbers
        list.stream().filter(x->x%2==0).count();

        // starting with two
        List<String> value = list.stream().map(x->String.valueOf(x)).filter(x->x.startsWith("2")).collect(Collectors.toList());
        System.out.println(value);

        // find duplicate
        HashSet<Integer> hs = new HashSet<>();
        list.stream().filter(x->!hs.add(x)).collect(Collectors.toList());

        // fin min max
        Optional<Integer> min = list.stream().min((a, b) -> a - b);
        System.out.println(min.get());
        Stream.of(list.stream() , list.stream());


        // stream random
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        List<Map.Entry>ll = list.stream()
                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x->x.getValue()>1)
                .collect(Collectors.toList());
        System.out.println(ll);
        String value2  = "asfwwess";
        Map<Character , Long> v =  value2.chars().mapToObj(x->(char) x)
                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
        System.out.println(v);

        // object to map


    }
}
