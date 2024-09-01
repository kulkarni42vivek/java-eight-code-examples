package Java8.StreamApi;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
    public static void main(String[] args) {
        Map<String, String> map  =new HashMap<>();
        map.put("vivke","awe");
        map.put("w","we");
        map.put("aw","were");

        map.forEach((key, value)-> System.out.println(key + " ->> " + value));

        map.entrySet().stream().forEach(x-> System.out.println(x.getKey() + " --> " + x.getValue()));
        System.out.println("_---------------------");
        map.entrySet().stream().filter(x-> x.getKey().contains("w")).forEach(x-> System.out.println(x.getKey() + " --> " + x.getValue()));
    }
}
