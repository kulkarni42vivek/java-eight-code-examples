package JavaCollections;

import java.util.ArrayList;
import java.util.*;

public class SynchronizedArrayList {
    public static void main(String[] args) {
        List<String> list  =  Collections.synchronizedList(new ArrayList<String>());
        list.add("25");
        System.out.println(list.toString());
    }
}
