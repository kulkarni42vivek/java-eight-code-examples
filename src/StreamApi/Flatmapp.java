package StreamApi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmapp {
    public static void main(String[] args) {
        List<List<Integer>> array  = Arrays.asList( Arrays.asList(12,15,78,78,5) , Arrays.asList(87,4));
        array.forEach(System.out::println);
        array.stream().flatMap(x-> x.stream()).forEach(x-> System.out.println(x));

        String[] stringarray  = new String[]{"asdf","asdfsa","wef"};
        List<Character> charArray = Arrays.stream(stringarray)
                .flatMap(x-> x.chars().mapToObj(y-> (char) y))
                .collect(Collectors.toList());
    }
}
