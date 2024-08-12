package JavaCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeClass {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("saf");
        deque.add("wwe");
        deque.add("wpo");
        deque.add("pomwo");
        deque.add("erf");

        deque.offerFirst("wewe");
        deque.offerFirst("jk");
        deque.offerLast("werww");
        System.out.println(deque.toString());
    }
}
