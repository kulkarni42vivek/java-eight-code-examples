package Java8.StreamApi;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        String[] array = {"f","s","s","s"};
        IntStream.range(0, array.length).mapToObj(x-> array[x]).collect(Collectors.toList());

        Stream.generate(()->Math.random()).limit(10).collect(Collectors.toList());
        Stream.iterate(0,x-> x+1).limit(10).collect(Collectors.toList());

        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(null);
        Stream.ofNullable(list);
        System.out.println(list);
    }
}
