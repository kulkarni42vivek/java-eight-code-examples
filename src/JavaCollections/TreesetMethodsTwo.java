package JavaCollections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetMethodsTwo {
    public static void main(String[] args) {

        TreeSet<Integer> tree_set = new TreeSet<Integer>();
        tree_set.add(5);
        tree_set.add(1);
        tree_set.add(50);
        tree_set.add(10);
        tree_set.add(20);
        tree_set.add(6);
        tree_set.add(20);
        tree_set.add(18);
        tree_set.add(9);
        tree_set.add(30);
        tree_set.add(25);
        TreeSet<Integer> sub_set = new TreeSet<Integer>();

        sub_set = (TreeSet<Integer>)tree_set.subSet(6, 30);

        // Creating an Iterator
        Iterator iterateaa;
        iterateaa = sub_set.iterator();

        // Displaying the tree set data
        System.out.println("The resultant values within the sub set: ");

        // Iterating through the subset
        while (iterateaa.hasNext()) {
            System.out.print(iterateaa.next() + " ");
        }
        System.out.println();
        // tailset
        TreeSet<Integer> tset = (TreeSet<Integer>) tree_set.tailSet(25);
        for(Integer s : tset ){
            System.out.print(s   +  " --> ");
        }
    }
}
