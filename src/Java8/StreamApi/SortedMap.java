package Java8.StreamApi;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedMap {
    public static void main(String[] args) {
        Map<String, String> map  =new HashMap<>();
        map.put("vivke","awe");
        map.put("w","we");
        map.put("aw","were");

        LinkedHashMap<String, String> collect = map.entrySet().stream().parallel()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(collect);
    }
}
