package JavaCollections.Maps;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapSort {
    public static void main(String[] args) {
        Map<Integer , String> hmap2 = new HashMap<>();
        hmap2.put(11,"sadf");
        hmap2.put(12,"wer");
        hmap2.put(13,"wrew");
        hmap2.put(15,"werter");

        List<Integer> sortedKeys  = new ArrayList<>(hmap2.keySet());
        Collections.sort(sortedKeys);
        for(Integer key : sortedKeys){
            System.out.println(key  + " -- " + hmap2.get(key));
        }

        // -----------------------------------------------------------------------

        Map<Integer, String> mpp = hmap2.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue));
        System.out.println(mpp);


    }
}
