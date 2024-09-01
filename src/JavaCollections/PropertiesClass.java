package JavaCollections;

import java.util.*;

public class PropertiesClass {
    public static void main(String[] args) {
        Properties p = System.getProperties();
        Set set =  p.entrySet();
        p.setProperty("name", "Ganesh Chowdhary Sadanala");
        p.setProperty("email","ganeshs.gfg@gmail.com");

        Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
