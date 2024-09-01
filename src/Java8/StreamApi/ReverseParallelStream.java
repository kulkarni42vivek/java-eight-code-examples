package Java8.StreamApi;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseParallelStream {
    public static void main(String[] args) {
        List<Integer> list  = List.of(12,445,74,78,44,25,32,21);
        List<Integer> answer  =list.parallelStream().collect(
                Collectors.collectingAndThen(Collectors.toList() , l->{
                    Collections.reverse(l);
                    return l;
                })
        );

        System.out.println(answer);
    }
}
