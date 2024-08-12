package JavaCollections;
import java.util.*;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        System.out.println(set);
//
//        Iterator<String> itr=set.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//
//        for(String s : set){
//            System.out.println(s);
//        }
//
//        System.out.println(set.contains("saf"));
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());
//        System.out.println(set.remove("ads"));
        set.add(null);
        set.add(null);
        set.add("ertgg");
        System.out.println(set);
    }
}
