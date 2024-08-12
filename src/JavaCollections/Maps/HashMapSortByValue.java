package JavaCollections.Maps;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapSortByValue {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        Map<String, Integer> hm1 = sortByValue(hm);
        System.out.println(hm1);

        HashMap<String, Integer> temp
                = hm.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(temp);

    }

    private static Map<String, Integer> sortByValue(HashMap<String, Integer> hm) {

        Map<String, Integer> linkedHashMp = new LinkedHashMap<>();

        Set<Map.Entry<String , Integer>> list  = hm.entrySet();
        ArrayList<Map.Entry<String , Integer>> array  = new ArrayList<>(list);
        Collections.sort(array ,  (o1, o2) -> {
            return o1.getValue().compareTo(o2.getValue());
        });
        for(Map.Entry<String, Integer> mapobj : array){
            linkedHashMp.put(mapobj.getKey(), mapobj.getValue());
        }
        return linkedHashMp;
    }
}
