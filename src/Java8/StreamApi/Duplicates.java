package Java8.StreamApi;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        String name  = "sdfsdffw";
        // first unique character
        Optional<Character> ch =  name.chars()
                .mapToObj(x->(char)x)
                .filter(x->name.indexOf(x) == name.lastIndexOf(x))
                .findFirst();
        System.out.println(ch.get());

        Optional<Map.Entry<Character, Long>> ch1= name.chars().mapToObj(x->(char) x)
                .collect(Collectors.groupingBy(Function.identity(),()->new LinkedHashMap<>(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x-> x.getValue() == 1)
                .findFirst();

        System.out.println(ch1.get());
    }
}
