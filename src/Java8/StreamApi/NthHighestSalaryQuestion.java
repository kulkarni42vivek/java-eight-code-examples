package Java8.StreamApi;

import java.util.HashMap;
import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalaryQuestion {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("anil" , 100);
        map.put("sdf",45);
        map.put("aew",78);
        map.put("aewa",25);
        map.put("aews",28);
        map.put("aewd",18);
        map.put("aewr",68);

        map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(1);

        System.out.println(map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(1));

        map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(1);

        map.entrySet().stream()
                .collect(Collectors.groupingBy(x->x.getValue(), Collectors.toList()));
    }
}
