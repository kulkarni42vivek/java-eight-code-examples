package JavaCollections.Maps;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExtwo {
    public static void main(String[] args) {
        NavigableMap<Integer, String>
                treemap = new TreeMap<Integer,
                String>((a, b)
                -> ((a > b)
                ? 1
                : ((a == b)
                ? 0
                : -1)));

        // populating tree map
        treemap.put(1, " A ");
        treemap.put(2, " B ");
        treemap.put(3, " C ");
        treemap.put(4, " D ");
        treemap.put(6, " E ");
        try {
            System.out.println("submap --> " + treemap.subMap(1,4));
            System.out.println("headmap --> " + treemap.headMap(3));
            System.out.println("tailmap --> " + treemap.tailMap(3));
            System.out.println("higher --> " + treemap.higherEntry(3));
            System.out.println("lower entry --> " + treemap.lowerEntry(3));
            treemap.pollFirstEntry();
            treemap.pollLastEntry();
            System.out.println(treemap);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
