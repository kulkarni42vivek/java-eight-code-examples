package JavaCollections.Maps;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapclass {
    public static void main(String[] args) {
        Map<Integer , String> hmap = new HashMap<>();
        hmap.put(11,"sadf");
        hmap.put(12,"wer");
        hmap.put(13,"wrew");
        hmap.put(15,"werter");
        Map<Integer, String> hmap2 = new HashMap<>();
        hmap2.putAll(hmap);

        hmap2.putIfAbsent(14,"asds");
        System.out.println(hmap2);
        hmap2.remove(11);
        System.out.println(hmap2);

        Set<Integer> keyvalue = hmap2.keySet();
        List<String> valuesList = hmap2.values().stream().collect(Collectors.toList());
        System.out.println(valuesList);

        for(Map.Entry entry  : hmap2.entrySet()){
            System.out.println(entry.getKey()
             + " --> " + entry.getValue()
             );
        }
        System.out.println(hmap2.containsValue("asds"));
        System.out.println(hmap2.containsKey(12));

        // sorting a hashmap

        List<Integer> sortedKeys  = new ArrayList<>(hmap2.keySet());
        Collections.sort(sortedKeys);
        for(Integer key : sortedKeys){
            System.out.println(key  + " -- " + hmap2.get(key));
        }
    }
}
