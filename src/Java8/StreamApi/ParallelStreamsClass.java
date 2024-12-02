package Java8.StreamApi;
import java.util.*;
public class ParallelStreamsClass {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        listOfNumbers.stream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );

        List<Integer> listOfNumbers2 = Arrays.asList(1, 2, 3, 4);
        listOfNumbers2.parallelStream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );


        List<Integer> listOfNumbers3 = Arrays.asList(1, 2, 3, 4);
        int sum = listOfNumbers3.parallelStream().reduce(0, (a,b)->{return a+b;});
        System.out.println(sum);
    }
}
