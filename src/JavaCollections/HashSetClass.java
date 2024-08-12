package JavaCollections;
import java.util.*;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        System.out.println(set.toString());

        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
