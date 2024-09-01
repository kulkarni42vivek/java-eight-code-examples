package JavaCollections;

import java.util.*;

public class HashTableClass {
    public static void main(String[] args) {
        Hashtable<String , Integer> ht = new Hashtable<>();
        ht.put("vivek",25);
        ht.put("asdf",85);
        ht.put("wer",878);
        ht.put("were",11);

        System.out.println(ht);

        Enumeration em = ht.elements();
        while(em.hasMoreElements()){
            System.out.println(em.nextElement());
        }

    }
}
