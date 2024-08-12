package StreamApi;

import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Eleven {
    public static void main(String[] args) {
        int[] array = new int[]{12,45,1,52,51};
        Arrays.stream(array).mapToObj(x-> Integer.valueOf(x)).max(Comparator.comparing(Integer::valueOf)).get();

        Stream.generate(()->Math.random()).collect(Collectors.toList());
        Stream.iterate(0,x-> x+1).limit(10).collect(Collectors.toList());
        Arrays.stream(array).reduce(0 , (a,b)-> a+b);
    }
}
