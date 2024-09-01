package Java8.StreamApi;

import java.util.*;

public class MapSorting {
    public static void main(String[] args) {

        Map<String, String> map  =new HashMap<>();
        map.put("vivke","awe");
        map.put("w","we");
        map.put("aw","were");
        map.put("awe","were");
        map.put("awl","were");
        map.put("awj","were");

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
    }
}
