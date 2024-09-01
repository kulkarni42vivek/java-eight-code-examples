package Java8.StreamApi;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Twelve {
    public static void main(String[] args) {
        Map<String , Integer> map  = new HashMap<>();
        map.put("asf0",15);
        map.put("we",45);
        map.put("er0",451);

        map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                ;
        map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Map.Entry::getKey)))
                .collect(Collectors.toList());
    }
}
