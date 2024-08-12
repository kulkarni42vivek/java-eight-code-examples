package JavaCollections.Maps;
import java.util.*;
public class TreeMapClassEx {
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
            System.out.println("Ceiling key entry for 5: "
                    + treemap.ceilingKey(5));
            System.out.println(treemap.ceilingEntry(6));
            System.out.println(treemap.descendingKeySet());
            System.out.println(treemap.descendingMap());
            System.out.println(treemap.firstEntry());
            System.out.println(treemap.floorEntry(4));

        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
