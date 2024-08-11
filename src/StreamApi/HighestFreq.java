package StreamApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestFreq {
    public static void main(String[] args) {
        String name  = "asfsdfsas";
        Map.Entry<Character, Long> hmap = name
                .chars()
                .mapToObj(x-> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(0);
        System.out.println(hmap);
    }
}
