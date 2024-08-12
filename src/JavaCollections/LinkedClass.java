package JavaCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedClass {
    public static void main(String[] args) {
        LinkedList<Integer> linked = new LinkedList<>();
        linked.add(25);
        linked.add(23);
        linked.add(356);
        linked.add(23);
        linked.add(87);

        System.out.println(linked.toString());
        Iterator<Integer> itr = linked.iterator();
        while(itr.hasNext()){
            Integer value  = itr.next();
            System.out.println(value);
        }
    }
}
