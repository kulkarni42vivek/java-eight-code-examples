package Java8.StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsV {
    public static void main(String[] args) {
        Map<String, Integer> hmp = new HashMap<>();
        hmp.put("assd", 561);
        hmp.put("asfd", 55);
        hmp.put("aasd", 51);
        hmp.put("ascd", 61);
        hmp.put("asxd", 461);
        hmp.put("asxds", 461);
        hmp.put("asdxx", 51);

        Map.Entry<Integer, List<String>> mapentry =  hmp.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Map.Entry::getKey)))
                .collect(Collectors.toList()).get(1);
        System.out.println(mapentry);

        Map.Entry<Integer, List<String>> integerListEntry = hmp.entrySet().stream()
                .collect(Collectors.groupingBy(x -> x.getValue(), Collectors.mapping(x -> x.getKey(), Collectors.toList())))
                .entrySet()
                .stream()
                .sorted((o1, o2) -> o2.getKey() - o1.getKey())
                .collect(Collectors.toList()).get(1);
        System.out.println(integerListEntry);
    }
}
