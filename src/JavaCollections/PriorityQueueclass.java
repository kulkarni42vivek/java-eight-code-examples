package JavaCollections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueclass {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).compareTo((String) o1);
            }
        });
        priorityQueue.add("asdf");
        priorityQueue.add("wew");
        priorityQueue.add("werw");
        priorityQueue.add("ef");
        System.out.println(priorityQueue.toString());

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }

        PriorityQueue<String> prio = new PriorityQueue<>((o1, o2) -> o1.compareTo(o2));
        prio.add("sdf");
        prio.add("wer");
        prio.add("er");
        System.out.println(prio.toString());
        Iterator<String> iteratorr =prio.iterator();
        while (iteratorr.hasNext()){
            System.out.println(iteratorr.next());
        }
    }
}
