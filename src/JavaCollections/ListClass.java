package JavaCollections;

import java.sql.SQLOutput;
import java.util.*;

public class ListClass {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        list.add(25);
        list.add(253);
        list.add(14);
        list.add(11);
        list.add(11);

        System.out.println(list.toString());

        Iterator<Integer> itr  = list.iterator();
        while(itr.hasNext()){
            Integer value = itr.next();
            System.out.println(value);
        }
    }
}
