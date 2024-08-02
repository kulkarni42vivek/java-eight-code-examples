package StreamApi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmapp {
    public static void main(String[] args) {
        // code 1
        List<List<Integer>> array  = Arrays.asList( Arrays.asList(12,15,78,78,5) , Arrays.asList(87,4));
        array.forEach(System.out::println);
        array.stream().flatMap(x-> x.stream()).forEach(x-> System.out.println(x));

        // code 2
        String[] stringarray  = new String[]{"asdf","asdfsa","wef"};
        List<Character> charArray = Arrays.stream(stringarray)
                .flatMap(x-> x.chars().mapToObj(y-> (char) y))
                .collect(Collectors.toList());

        // code 3
        List<Person> people = Arrays.asList(
                new Person("Alice", Arrays.asList("Red", "Blue")),
                new Person("Bob", Arrays.asList("Green", "Yellow")),
                new Person("Charlie", Arrays.asList("Purple"))
        );

        List<String> strings =  people.stream()
                .flatMap(x->x.getFavoriteColors().stream())
                .collect(Collectors.toList());
        System.out.println(strings.toString());


        // code 4
        people.stream()
                .map(x-> x.getFavoriteColors())
                .forEach(x-> System.out.println(x));


    }
}
class Person {
    private String name;
    private List<String> favoriteColors;

    public Person(String name, List<String> favoriteColors) {
        this.name = name;
        this.favoriteColors = favoriteColors;
    }

    public List<String> getFavoriteColors() {
        return favoriteColors;
    }
}