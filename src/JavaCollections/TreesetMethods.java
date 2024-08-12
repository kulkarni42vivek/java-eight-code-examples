package JavaCollections;

import java.util.Iterator;
import java.util.*;

public class TreesetMethods {
    public static void main(String[] args) {
        TreeSet<String> tset  = new TreeSet<>();
        tset.add("sadf");
        tset.add("et");
        tset.add("wer");
        tset.add("wet");
        tset.add("3wol");
        tset.add("mko");
        tset.add("poi");
        tset.add("65asdf");
        System.out.println(tset);

        TreeSet<Integer> treeadd = new TreeSet<Integer>();

        treeadd.add(10);
        treeadd.add(20);
        treeadd.add(30);
        treeadd.add(40);

        System.out.println("TreeSet: " + treeadd);

        int value = treeadd.ceiling(25);
        System.out.println("------" + value);
        int value2 = treeadd.floor(25);
        System.out.println("------" + value2);
        Iterator desc = treeadd.descendingIterator();
        while(desc.hasNext()){
            System.out.println(desc.next());
        }
        Set<Integer> set = treeadd.descendingSet();
        System.out.println(set);

        System.out.println("higher :: " + treeadd.higher(25));
        System.out.println("lower :: " + treeadd.lower(25));



        // -----------------------------------------------------------
        // -----------------------------------------------------------

        TreeSet<Integer> tree_set = new TreeSet<Integer>();
        tree_set.add(1);
        tree_set.add(2);
        tree_set.add(3);
        tree_set.add(4);
        tree_set.add(5);
        tree_set.add(10);
        tree_set.add(20);
        tree_set.add(30);
        tree_set.add(40);
        tree_set.add(50);

        TreeSet<Integer> head_set = new TreeSet<Integer>();

        head_set = (TreeSet<Integer>)tree_set.headSet(30);

        Iterator iterate;
        iterate = head_set.iterator();

        System.out.println(
                "The resultant values till head set: ");

        while (iterate.hasNext()) {
            System.out.print(iterate.next() + " ");
        }



    }
}
