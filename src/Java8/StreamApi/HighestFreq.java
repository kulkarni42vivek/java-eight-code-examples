package Java8.StreamApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestFreq {
    public static void main(String[] args) {
        String name  = "asfsdfsas";
        Map.Entry<Character, Long> hmap = name
                .chars()
                .mapToObj(x-> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder((o1, o2) -> (int)(o1.getValue()-o2.getValue())))
                .collect(Collectors.toList())
                .get(0);
        System.out.println(hmap);



        int[] arr = new int[]{1,1,25,25,2,25,6,6};
        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(0);

        name.chars()
                .mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList())
                .get(0).getKey();

        name.chars()
                .mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(Collectors.toList())
                .get(0).getKey();

    }
}
