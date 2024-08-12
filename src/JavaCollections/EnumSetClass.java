package JavaCollections;

import java.util.EnumSet;
import java.util.*;

public class EnumSetClass {
    enum days{
        SUNDAY, MONDAY, TUESDAY
    }
    public static void main(String[] args) {
        Set<days> set = EnumSet.of(days.SUNDAY, days.MONDAY);
        Iterator<days> itr= set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(EnumSet.allOf(days.class));
        System.out.println(EnumSet.noneOf(days.class));
    }
}
