package Java8.StreamApi;

import java.util.*;
import java.util.function.Function;
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

        Map<Character, Long> collect = "testtest".chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);


        List<Flatmapp.Customer> custom  = List.of(
                new Flatmapp.Customer("vivek" , List.of("vivek","two")),
                new Flatmapp.Customer("two",List.of("three" , "four")),
                new Flatmapp.Customer("four",List.of("asf","sdf"))
        );

        List<String> list  = custom.stream().map(Flatmapp.Customer::getName).collect(Collectors.toList());
        System.out.println(list);

        List<String> llist =  custom.stream().flatMap(x-> x.getEmails().stream()).collect(Collectors.toList());
        List<String> lllist = custom.stream().map(Flatmapp.Customer::getEmails).flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(llist);
        System.out.println(lllist);


        List<List<List<String>>> values  = List.of(
                List.of(
                        List.of(
                                "vivek", "vijay","kulkarni"
                        ),
                        List.of(
                                "one", "two","three"
                        )
                ),
                List.of(

                        List.of(
                                "four", "five","six"
                        )
                )
        );
        System.out.println(values);

        List<String> collect3 = values.stream()
                .flatMap(Collection::stream)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        List<String> collect1 = values.stream().flatMap(x -> x.stream().flatMap(Collection::stream)).collect(Collectors.toList());
        System.out.println(collect3);
        System.out.println(collect1);
    }

    static class Customer{
        String name ;
        List<String> emails;

        public Customer(String name, List<String> emails) {
            this.name = name;
            this.emails = emails;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getEmails() {
            return emails;
        }

        public void setEmails(List<String> emails) {
            this.emails = emails;
        }
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