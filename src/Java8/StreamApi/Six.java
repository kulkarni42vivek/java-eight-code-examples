package Java8.StreamApi;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Six {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,25,15,12,11);
        List<Integer> answer = list.stream()
                .collect(Collectors.groupingBy(Function.identity()  , Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x-> x.getValue()> 1)
                .map(x-> x.getKey())
                .collect(Collectors.toList());
        System.out.println(answer);

        // max count
        list.stream()
                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(0).getKey();

    }
}
