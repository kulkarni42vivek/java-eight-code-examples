package Java8.StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class MapStreams {
    public static void main(String[] args) {
        Map<String, String> map  =new HashMap<>();
        map.put("vivke","awe");
        map.put("w","we");
        map.put("aw","were");

        map.forEach((key, value)-> System.out.println(key + " ->> " + value));

        map.entrySet().stream().forEach(x-> System.out.println(x.getKey() + " --> " + x.getValue()));
        System.out.println("_---------------------");
        map.entrySet().stream().filter(x-> x.getKey().contains("w")).forEach(x-> System.out.println(x.getKey() + " --> " + x.getValue()));

        // --------------------------------------------------------------------------------------------------------------------------------------

        ArrayList<Map.Entry<String, String>> arraylist = new ArrayList<>(map.entrySet());

        Collections.sort(arraylist, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                if(o2.getValue().compareTo(o1.getValue()) == 0){
                    return o2.getKey().compareTo(o1.getKey());
                }
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println(arraylist);


        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(System.out::println);


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
