package JavaCollections;
import java.util.*;

public class QueAndPrio {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        System.out.println(queue.peek());
        queue.offer("dsdf");
        queue.offer("sdf");
        queue.offer("wer");
        queue.offer("rggg");
        queue.offer("her");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
