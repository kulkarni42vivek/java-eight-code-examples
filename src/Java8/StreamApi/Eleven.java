package Java8.StreamApi;

import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Eleven {
    public static void main(String[] args) {
        int[] array = new int[]{12,45,1,52,51};
        Arrays.stream(array).boxed().max(Comparator.comparing(Integer::valueOf)).get();

        Stream.generate(()->Math.random()).limit(10).collect(Collectors.toList());
        Stream.iterate(0,x-> x+1).limit(10).collect(Collectors.toList());
        int reduce = Arrays.stream(array).reduce(0, (a, b) -> a + b);

        Arrays.stream(array).boxed().max(Comparator.comparing(Integer::valueOf)).get();


        Stream.of(array).forEach(System.out::println);

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        hm.put("Networaking", 80);

        hm.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue , ((integer, integer2) -> integer) , LinkedHashMap::new));
    }
}
