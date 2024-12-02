package Java8.StreamApi;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HighFreqTest {
    public static void main(String[] args) {
        String name  = "asfsdfgsaspqpqmdffh";
       Optional<Character> k= name.chars().mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(Function.identity(),()->new LinkedHashMap<>(), Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue() == 1)
                        .map(x->{return x.getKey();}).findFirst();


        System.out.println(k);
    }
}
