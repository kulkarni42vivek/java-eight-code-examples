package JavaCollections;
import java.util.*;
public class LinkedHashSetClass {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String s : set){
            System.out.println(s);
        }
        set.add(null);
        set.add(null);
        set.add("erg");
        System.out.println(set);
    }
}
