package Java8.StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class OneTest {
    public static void main(String[] args) {
        List<List<Integer>> array = List.of(List.of(12,44,454,41,40), List.of(45,21,10,36));
        List<Integer> ll = array.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(ll);
    }
}
