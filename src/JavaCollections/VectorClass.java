package JavaCollections;

import java.util.Iterator;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(250);
        vector.add(12);
        vector.add(35);
        vector.add(89);
        vector.add(98);

        System.out.println(vector.toString());
        Iterator<Integer> vlist =  vector.iterator();
        while(vlist.hasNext()){
            System.out.println(vlist.next());
        }
    }
}
