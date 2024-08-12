package JavaCollections;

import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<>();
        arr.add(25);
        arr.add(256);
        List<Integer> arr2 = new ArrayList<>();
        arr.addAll(arr2);

        arr.clear();

        arr.add(25);
        arr.add(256);

        System.out.println(arr.get(0));
        System.out.println(arr.isEmpty());

        Iterator<Integer> itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(arr.indexOf(25));
        System.out.println(arr.lastIndexOf(25));

        ArrayList<String> array  = new ArrayList<>();
        array.add("sf");
        array.add("wer");
        array.add("pom");
        array.add("egr");

        //        Integer[] arra = new Integer[arr.size()];
        //        arra = arr.toArray(arra);

        //        arr.stream().mapToInt(Integer::intValue).toArray();
        arr.remove(1);

        System.out.println(arr);
        array.sort(String::compareTo);
        System.out.println(array);

        ListIterator<String> ir = array.listIterator(array.size());
        while(ir.hasPrevious()){
            System.out.println(ir.previous());
        }
        System.out.println(arr);
        arr.remove((Integer) 25);
        System.out.println(arr);
    }
}
